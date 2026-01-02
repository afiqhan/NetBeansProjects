/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryLateFee;
/**
 *
 * @author AFIQ HANIF
 */
import java.util.Scanner;

public class LibraryLateFee {

    // Method to calculate late fee
    public static double calculateLateFee(int daysLate) {
        double feePerDay = 1.50; // RM1.50 per day
        return daysLate * feePerDay;
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of days late: ");
        int daysLate = input.nextInt();

        double totalFee = calculateLateFee(daysLate);

        System.out.println("Total Late Fee: RM " + totalFee);

        input.close();
    }
}

