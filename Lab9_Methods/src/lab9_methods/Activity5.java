/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9_methods;
/**
 *
 * @author AFIQ HANIF
 */
public class Activity5 {

    public static void main(String[] args) {

        System.out.printf("%-15s %-10s %-15s %-18s %-18s%n",
                "Taxable Income", "Single", "Married Joint",
                "Married Separate", "Head of a House");

        for (int income = 50000; income <= 60000; income += 50) {

            long single = computeTax(income, 0.17);
            long marriedJoint = computeTax(income, 0.15);
            long marriedSeparate = computeTax(income, 0.18);
            long head = computeTax(income, 0.16);

            System.out.printf("%-15d %-10d %-15d %-18d %-18d%n",
                    income, single, marriedJoint, marriedSeparate, head);
        }
    }

    // Method to compute tax
    public static long computeTax(int income, double rate) {
        return Math.round(income * rate);
    }
}

