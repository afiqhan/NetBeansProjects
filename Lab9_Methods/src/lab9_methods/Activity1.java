/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9_methods;

/**
 *
 * @author S62993
 */
public class Activity1 {

    public static void main(String[] args) {

        // Pre-initialized sales values (boleh ubah ikut arahan)
        double[] sales = {20000.30, 15008.90, 12584.10, 87543.00, 28791.30};

        // Find maximum
        double max = sales[0];
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > max) {
                max = sales[i];
            }
        }
        
        System.out.printf("%-12s %-10s %-10s %-14s %-12s%n",
                "SALES", "CEIL", "FLOOR", "SQUARE ROOT", "RADIAN");

        // Print table rows using Math methods
        for (int i = 0; i < sales.length; i++) {
            double x = sales[i];

            double ceilVal = Math.ceil(x);
            double floorVal = Math.floor(x);
            double sqrtVal = Math.sqrt(x);
            double radVal = Math.toRadians(x);

            System.out.printf("%-12.2f %-10.2f %-10.2f %-14.2f %-12.2f%n",
                    x, ceilVal, floorVal, sqrtVal, radVal);
        }

        // Display list of array
        System.out.println("\nList of array (sales):");
        for (int i = 0; i < sales.length; i++) {
            System.out.printf("%.2f", sales[i]);
            if (i != sales.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Display maximum value
        System.out.printf("\nMaximum value = %.2f%n", max);
    }
}