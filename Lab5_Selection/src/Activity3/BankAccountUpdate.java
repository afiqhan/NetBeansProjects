/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity3;
/**
 *
 * @author AFIQ HANIF
 */
import java.util.Scanner;

public class BankAccountUpdate {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = input.nextInt();

        System.out.print("Enter account type (S/s for Savings, C/c for Checking): ");
        char accountType = input.next().charAt(0);

        System.out.print("Enter minimum balance: ");
        double minimumBalance = input.nextDouble();

        System.out.print("Enter current balance: ");
        double currentBalance = input.nextDouble();

        double newBalance = currentBalance;

        if (currentBalance < minimumBalance) {

            if (accountType == 'S' || accountType == 's') {
                newBalance = currentBalance - 10.00;
            } else if (accountType == 'C' || accountType == 'c') {
                newBalance = currentBalance - 25.00;
            } else {
                System.out.println("Invalid account type.");
                return;
            }

        } else {

            if (accountType == 'S' || accountType == 's') {
                newBalance = currentBalance + (currentBalance * 0.04);

            } else if (accountType == 'C' || accountType == 'c') {

                if ((currentBalance - minimumBalance) <= 5000) {
                    newBalance = currentBalance + (currentBalance * 0.03);
                } else {
                    newBalance = currentBalance + (currentBalance * 0.05);
                }

            } else {
                System.out.println("Invalid account type.");
                return;
            }
        }

        System.out.println("\nAccount Number : " + accountNumber);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Current Balance: RM " + currentBalance);
        System.out.println("New Balance    : RM " + newBalance);

        input.close();
    }
}