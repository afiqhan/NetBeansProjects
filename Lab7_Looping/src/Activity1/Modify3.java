package Activity1;

import java.util.Scanner;

public class Modify3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int firstNumber;
        int secondNumber;

        // Input & validation using do-while
        do {
            System.out.print("Enter first integer: ");
            firstNumber = input.nextInt();

            System.out.print("Enter second integer: ");
            secondNumber = input.nextInt();

            if (firstNumber >= secondNumber) {
                System.out.println("Error: First number must be less than second number.");
            }
        } while (firstNumber >= secondNumber);

        int i = firstNumber;

        // Odd numbers (do-while)
        System.out.println("\nOdd Numbers:");
        do {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= secondNumber);

        i = firstNumber;

        // Even numbers (do-while)
        System.out.println("\n\nEven Numbers:");
        do {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= secondNumber);

        input.close();
    }
}
