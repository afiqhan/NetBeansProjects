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

public class OddEvenWhileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int firstNumber;
        int secondNumber;

        System.out.print("Enter first integer: ");
        firstNumber = input.nextInt();

        System.out.print("Enter second integer: ");
        secondNumber = input.nextInt();

        while (firstNumber >= secondNumber) {
            System.out.println("Error: First number must be less than second number.");
            System.out.print("Enter first integer again: ");
            firstNumber = input.nextInt();
            System.out.print("Enter second integer again: ");
            secondNumber = input.nextInt();
        }

        int i = firstNumber;

        System.out.println("\nOdd Numbers:");
        while (i <= secondNumber) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }

        i = firstNumber;

        System.out.println("\n\nEven Numbers:");
        while (i <= secondNumber) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }

        input.close();
    }
}