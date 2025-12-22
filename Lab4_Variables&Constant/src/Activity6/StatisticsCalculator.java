/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity6;
/**
 *
 * @author AFIQ HANIF
 */
import java.util.Scanner;
public class StatisticsCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value x1: ");
        double x1 = sc.nextDouble();

        System.out.print("Enter value x2: ");
        double x2 = sc.nextDouble();

        System.out.print("Enter value x3: ");
        double x3 = sc.nextDouble();

        double mean = (x1 + x2 + x3) / 3.0;

        double variance = (Math.pow(x1 - mean, 2)
                          + Math.pow(x2 - mean, 2)
                          + Math.pow(x3 - mean, 2)) / 3.0;

        double standardDeviation = Math.sqrt(variance);

        System.out.println("Mean = " + mean);
        System.out.println("Variance = " + variance);
        System.out.println("Standard Deviation = " + standardDeviation);
    }
}

