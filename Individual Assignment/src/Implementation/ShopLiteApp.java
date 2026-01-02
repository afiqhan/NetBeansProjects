/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Implementation;
/**
 * @author MUHAMMAD AFIQ HANIF BIN SUHAIMI
 * PART B: IMPLEMENTATION
 * DATE: 25 DECEMBER 2025
 * CASE STUDY 3: SHOP LITE (SIMPLE INVENTORY & SALES SYSTEM)
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ShopLiteApp {

    // ====== CONFIG ======
    static final int MAX_PRODUCTS = 10;
    static final double TAX_RATE = 0.06;         // 6%
    static final double MEMBER_DISC_RATE = 0.10; // 10%
    static final double BULK_DISC_RATE = 0.05;   // 5%
    static final int BULK_THRESHOLD = 5;         // >= 5 units

    // ====== PRODUCT ARRAYS (Parallel Arrays) ======
    static String[] productName = new String[MAX_PRODUCTS];
    static double[] productPrice = new double[MAX_PRODUCTS];
    static int[] productStock = new int[MAX_PRODUCTS];
    static int productCount = 0;

    // ====== PURCHASE ARRAYS (for one transaction) ======
    static int[] cartProductIndex = new int[MAX_PRODUCTS]; // store index of product
    static int[] cartQty = new int[MAX_PRODUCTS];
    static int cartCount = 0;

    // ====== Receipt last transaction totals ======
    static double lastSubtotal = 0.0;
    static double lastDiscount = 0.0;
    static double lastTax = 0.0;
    static double lastFinalTotal = 0.0;
    static boolean lastIsMember = false;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Preload at least 5–10 records (requirement)
        seedProducts();

        int choice;
        do {
            showMainMenu();
            choice = readInt("Enter choice: ");

            switch (choice) {
                case 1 -> addProduct();
                case 2 -> displayProducts();
                case 3 -> searchProductMenu();
                case 4 -> processPurchase();
                case 5 -> generateReceiptFile();
                case 6 -> {
                    System.out.println("Exiting... Thank you.");
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 6);
    }

    // ====== 1) Menu UI ======
    static void showMainMenu() {
        System.out.println("\n===============================");
        System.out.println("           SHOPLITE");
        System.out.println("===============================");
        System.out.println("1. Add Product");
        System.out.println("2. Display Products");
        System.out.println("3. Search Product");
        System.out.println("4. Process Purchase");
        System.out.println("5. Generate Receipt (receipt.txt)");
        System.out.println("6. Exit");
        System.out.println("===============================");
    }

    // ====== 2) Seed products (5–10 records) ======
    static void seedProducts() {
        addProductInternal("Milo 1kg", 17.50, 20);
        addProductInternal("Coffee 3in1", 12.90, 30);
        addProductInternal("Mineral Water", 1.50, 50);
        addProductInternal("Bread", 2.80, 25);
        addProductInternal("Instant Noodles", 4.20, 40);
        addProductInternal("Cooking Oil 1L", 9.90, 15);
        addProductInternal("Sugar 1kg", 3.50, 18);
        addProductInternal("Rice 5kg", 18.90, 10);
        addProductInternal("Eggs (10)", 6.90, 12);
        addProductInternal("Biscuits", 5.60, 22);
    }

    static void addProductInternal(String name, double price, int stock) {
        if (productCount >= MAX_PRODUCTS) return;
        productName[productCount] = name;
        productPrice[productCount] = price;
        productStock[productCount] = stock;
        productCount++;
    }

    // ====== 3) Add Product ======
    static void addProduct() {
        if (productCount >= MAX_PRODUCTS) {
            System.out.println("Product list is FULL (max " + MAX_PRODUCTS + ").");
            return;
        }

        System.out.println("\n--- Add Product ---");
        String name = readNonEmptyString("Enter product name: ");
        double price = readDouble("Enter price (e.g., 12.50): ");
        int stock = readInt("Enter stock quantity: ");

        if (price < 0 || stock < 0) {
            System.out.println("Price/Stock cannot be negative.");
            return;
        }

        productName[productCount] = name;
        productPrice[productCount] = price;
        productStock[productCount] = stock;
        productCount++;

        System.out.println("Product added successfully.");
    }

    // ====== 4) Display Products ======
    static void displayProducts() {
        System.out.println("\n--- Product List ---");
        if (productCount == 0) {
            System.out.println("No products available.");
            return;
        }

        System.out.printf("%-4s %-25s %-10s %-8s%n", "No.", "Name", "Price(RM)", "Stock");
        System.out.println("------------------------------------------------------");

        for (int i = 0; i < productCount; i++) {
            System.out.printf("%-4d %-25s %-10.2f %-8d%n", (i + 1), productName[i], productPrice[i], productStock[i]);
        }
    }

    // ====== 5) Search Product ======
    static void searchProductMenu() {
        System.out.println("\n--- Search Product ---");
        String keyword = readNonEmptyString("Enter product name keyword: ");
        int idx = searchProduct(keyword);

        if (idx == -1) {
            System.out.println("Product not found.");
        } else {
            System.out.println("Found:");
            System.out.println("Name : " + productName[idx]);
            System.out.printf("Price: RM%.2f%n", productPrice[idx]);
            System.out.println("Stock: " + productStock[idx]);
        }
    }

    // returns index if found, else -1
    static int searchProduct(String keyword) {
        for (int i = 0; i < productCount; i++) {
            if (productName[i].toLowerCase().contains(keyword.toLowerCase())) {
                return i;
            }
        }
        return -1;
    }

    // ====== 6) Process Purchase (multiple items) ======
    static void processPurchase() {
        if (productCount == 0) {
            System.out.println("No products to purchase.");
            return;
        }

        // reset cart + totals
        cartCount = 0;
        lastSubtotal = 0.0;
        lastDiscount = 0.0;
        lastTax = 0.0;
        lastFinalTotal = 0.0;
        lastIsMember = false;

        System.out.println("\n--- Process Purchase ---");
        displayProducts();

        int addMore;
        do {
            int productNo = readInt("Select product number (1-" + productCount + "): ");
            int idx = productNo - 1;

            if (idx < 0 || idx >= productCount) {
                System.out.println("Invalid product number.");
            } else {
                int qty = readInt("Enter quantity: ");
                if (qty <= 0) {
                    System.out.println("Quantity must be greater than 0.");
                } else if (qty > productStock[idx]) {
                    System.out.println("Not enough stock. Available: " + productStock[idx]);
                } else {
                    // Add to cart (store index + qty)
                    cartProductIndex[cartCount] = idx;
                    cartQty[cartCount] = qty;
                    cartCount++;

                    System.out.println("Added to cart: " + productName[idx] + " x " + qty);
                }
            }

            addMore = readInt("Add more items? (1=Yes, 0=No): ");
        } while (addMore == 1 && cartCount < MAX_PRODUCTS);

        if (cartCount == 0) {
            System.out.println("No items selected. Purchase cancelled.");
            return;
        }

        // Member check
        lastIsMember = isMember();

        // Calculate totals based on proposal rules
        calculateTotal(lastIsMember);

        // Confirm purchase
        int confirm = readInt("Confirm purchase? (1=Confirm, 0=Cancel): ");
        if (confirm == 1) {
            updateStock();
            System.out.println("\nPurchase successful. Stock updated.");
            System.out.printf("Subtotal : RM%.2f%n", lastSubtotal);
            System.out.printf("Discount : RM%.2f%n", lastDiscount);
            System.out.printf("Tax (6%%) : RM%.2f%n", lastTax);
            System.out.printf("TOTAL    : RM%.2f%n", lastFinalTotal);
            System.out.println("You may now generate receipt via menu (Option 5).");
        } else {
            System.out.println("Purchase cancelled (no stock changes).");
            // reset totals to avoid wrong receipt
            cartCount = 0;
        }
    }

    // ====== 7) Member check (Selection) ======
    static boolean isMember() {
        String ans = readNonEmptyString("Is customer a member? (Y/N): ");
        return ans.equalsIgnoreCase("Y");
    }

    // ====== 8) Calculations (Arithmetic operations) ======
    static void calculateTotal(boolean isMember) {
        double subtotal = 0.0;
        double totalDiscount = 0.0;

        // Subtotal = Σ(unitPrice × qty)
        for (int i = 0; i < cartCount; i++) {
            int pIdx = cartProductIndex[i];
            int qty = cartQty[i];
            subtotal += productPrice[pIdx] * qty;
        }

        // Member discount (10%) on subtotal
        if (isMember) {
            totalDiscount += subtotal * MEMBER_DISC_RATE;
        }

        // Bulk discount (5%) for any line item qty >= 5
        // (Designed rule: apply additional discount on those line items)
        for (int i = 0; i < cartCount; i++) {
            int pIdx = cartProductIndex[i];
            int qty = cartQty[i];
            if (qty >= BULK_THRESHOLD) {
                double line = productPrice[pIdx] * qty;
                totalDiscount += line * BULK_DISC_RATE;
            }
        }

        double afterDiscount = subtotal - totalDiscount;
        double tax = afterDiscount * TAX_RATE;
        double finalTotal = afterDiscount + tax;

        // store last transaction results
        lastSubtotal = round2(subtotal);
        lastDiscount = round2(totalDiscount);
        lastTax = round2(tax);
        lastFinalTotal = round2(finalTotal);
    }

    static double round2(double v) {
        return Math.round(v * 100.0) / 100.0;
    }

    // ====== 9) Update stock ======
    static void updateStock() {
        for (int i = 0; i < cartCount; i++) {
            int pIdx = cartProductIndex[i];
            int qty = cartQty[i];
            productStock[pIdx] -= qty; // validation already done earlier
        }
    }

    // ====== 10) File handling: generate receipt.txt ======
    static void generateReceiptFile() {
        if (cartCount == 0) {
            System.out.println("No recent purchase data to print. Please process purchase first (Option 4).");
            return;
        }

        String fileName = "receipt.txt";

        try (PrintWriter out = new PrintWriter(new FileWriter(fileName, false))) {
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            String dt = LocalDateTime.now().format(fmt);

            out.println("====================================");
            out.println("             SHOPLITE RECEIPT");
            out.println("====================================");
            out.println("Date/Time   : " + dt);
            out.println("Member      : " + (lastIsMember ? "YES" : "NO"));
            out.println("------------------------------------");
            out.printf("%-25s %5s %10s%n", "Item", "Qty", "Amount");
            out.println("------------------------------------");

            // write item lines
            for (int i = 0; i < cartCount; i++) {
                int pIdx = cartProductIndex[i];
                int qty = cartQty[i];
                double lineTotal = productPrice[pIdx] * qty;
                out.printf("%-25s %5d %10.2f%n", productName[pIdx], qty, lineTotal);
            }

            out.println("------------------------------------");
            out.printf("Subtotal    : RM%.2f%n", lastSubtotal);
            out.printf("Discount    : RM%.2f%n", lastDiscount);
            out.printf("Tax (6%%)    : RM%.2f%n", lastTax);
            out.println("------------------------------------");
            out.printf("FINAL TOTAL : RM%.2f%n", lastFinalTotal);
            out.println("====================================");
            out.println("Thank you for shopping with us!");
            out.println("====================================");

            System.out.println("Receipt generated successfully: " + fileName);

        } catch (IOException e) {
            System.out.println("Error writing receipt file: " + e.getMessage());
        }
    }

    // ====== INPUT HELPERS (Loops + validation) ======
    static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = sc.nextLine().trim();
            try {
                return Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer. Please try again.");
            }
        }
    }

    static double readDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = sc.nextLine().trim();
            try {
                return Double.parseDouble(s);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please try again.");
            }
        }
    }

    static String readNonEmptyString(String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = sc.nextLine().trim();
            if (!s.isEmpty()) return s;
            System.out.println("Input cannot be empty. Please try again.");
        }
    }
}

