/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity5;

/**
 *
 * @author AFIQ HANIF
 */
import java.util.Scanner;

public class SignPriceCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double basePrice = 30.0;
        double totalPrice = basePrice;

        System.out.print("Enter customer name: ");
        String customerName = input.nextLine();

        System.out.print("Enter wood type (oak / mahogany / others): ");
        String woodType = input.nextLine().toLowerCase();

        System.out.print("Enter number of characters: ");
        int numCharacters = input.nextInt();

        input.nextLine(); // clear buffer

        System.out.print("Enter character color (black / white / gold): ");
        String colorType = input.nextLine().toLowerCase();

        // Wood type selection (switch)
        switch (woodType) {
            case "oak":
                totalPrice += 15;
                break;
            case "mahogany":
                totalPrice += 10;
                break;
            default:
                break;
        }

        // Characters charge (if-else)
        if (numCharacters > 6) {
            int extraChars = numCharacters - 6;
            totalPrice += extraChars * 3;
        }

        // Color charge (if-else)
        if (colorType.equals("gold")) {
            totalPrice += 12;
        }

        System.out.println("\nCustomer Name      : " + customerName);
        System.out.println("Wood Type          : " + woodType);
        System.out.println("Number of Characters: " + numCharacters);
        System.out.println("Character Color    : " + colorType);
        System.out.println("Final Price        : RM " + totalPrice);

        input.close();
    }
}

