package Activity1;
/**
 *
 * @author AFIQ HANIF
 */
import java.util.Scanner;

public class SquareCalculations {

    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();

        int square1 = num1 * num1;
        int square2 = num2 * num2;

        int sumOfSquares = square1 + square2;
        int differenceOfSquares = square1 - square2;

        System.out.println("Square of first number = " + square1);
        System.out.println("Square of second number = " + square2);
        System.out.println("Sum of squares = " + sumOfSquares);
        System.out.println("Difference of squares = " + differenceOfSquares);
    }
}
