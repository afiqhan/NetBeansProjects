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

public class GrossPayScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hourly rate: ");
        double hourlyRate = sc.nextDouble();

        System.out.print("Enter hours worked: ");
        double hoursWorked = sc.nextDouble();

        double grossPay = hourlyRate * hoursWorked;

        System.out.printf("Gross pay = RM%.2f%n", grossPay);
    }
}
