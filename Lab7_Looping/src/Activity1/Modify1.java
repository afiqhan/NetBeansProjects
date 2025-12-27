/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Activity1;

/**
 *
 * @author AFIQ HANIF
 */
import java.util.Scanner;

public class Modify1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int total = 0;
        int count = 0;

        int number;
        do {
            System.out.print("Enter an integer (0 to stop): ");
            number = input.nextInt();

            if (number != 0) {
                if (number > 0) {
                    positiveCount++;
                } else {
                    negativeCount++;
                }
                total += number;
                count++;
            }
        } while (number != 0);

        double average = 0;
        if (count > 0) {
            average = (double) total / count;
        }

        System.out.println("\nTotal positive numbers : " + positiveCount);
        System.out.println("Total negative numbers : " + negativeCount);
        System.out.println("Total value            : " + total);
        System.out.println("Average                : " + average);

        input.close();
    }
}
