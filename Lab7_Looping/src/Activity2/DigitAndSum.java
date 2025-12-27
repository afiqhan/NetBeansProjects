/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity2;
/**
 * @author AFIQ HANIF
 */
import java.util.Scanner;

public class DigitAndSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        int tempNumber = Math.abs(number);
        int sum = 0;

        String digits = "";

        do {
            int digit = tempNumber % 10;
            digits = digit + " " + digits;
            sum += digit;
            tempNumber /= 10;
        } while (tempNumber > 0);

        System.out.println("Digits: " + digits);
        System.out.println("Sum of digits: " + sum);

        input.close();
    }
}
