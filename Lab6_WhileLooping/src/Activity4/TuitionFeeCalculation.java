/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity4;
/**
 *
 * @author AFIQ HANIF
 */
public class TuitionFeeCalculation {
    public static void main(String[] args) {

        double tuition = 4000.0;
        int year = 1;

        while (year <= 10) {
            tuition *= 1.05;
            year++;
        }

        System.out.printf("Tuition fee after 10 years: RM %.2f%n", tuition);

        tuition = 4000.0;
        double totalCost = 0;
        year = 1;

        while (year <= 4) {
            totalCost += tuition;
            tuition *= 1.05;
            year++;
        }

        System.out.printf("Total cost for 4 years tuition: RM %.2f%n", totalCost);
    }
}