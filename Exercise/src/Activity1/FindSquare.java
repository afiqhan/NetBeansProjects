/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity1;

/**
 *
 * @author AFIQ HANIF
 */
import java.util.Scanner;

public class FindSquare {

    public static int findSquare(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = input.nextInt();

        int result = findSquare(number);
        System.out.println("Square of " + number + " is " + result);

        input.close();
    }
}

