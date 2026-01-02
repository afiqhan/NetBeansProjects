/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnlineShopping;

/**
 *
 * @author AFIQ HANIF
 */
import java.util.Scanner;

public class OnlineShopping {

    // Method to calculate discount
    public static double calculateDiscount(double amount) {
        if (amount > 500) {
            return amount * 0.10; // 10% discount
        } else {
            return 0.0; // no discount
        }
    }

    // Method to calculate final amount
    public static double calculateFinalAmount(double amount, double discount) {
        return amount - discount;
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter total purchase amount: RM ");
        double amount = input.nextDouble();

        double discount = calculateDiscount(amount);
        double finalAmount = calculateFinalAmount(amount, discount);

        System.out.println("Discount: RM " + discount);
        System.out.println("Final Amount to Pay: RM " + finalAmount);

        input.close();
    }
}

