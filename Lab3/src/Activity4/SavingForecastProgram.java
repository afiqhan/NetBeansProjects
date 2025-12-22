/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity4;
/**
 *
 * @author AFIQ HANIF
 */
import java.util.Scanner;

public class SavingForecastProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("****************************************");
        System.out.println("MY SAVING FORECAST PROGRAM");
        System.out.println("****************************************");
        System.out.println();

        System.out.print("WHAT IS THE VALUE YOU WANT TO HAVE IN YOUR ACCOUNT? RM ");
        double F = sc.nextDouble();

        System.out.print("HOW MANY YEARS YOU WANT THE MONEY TO SIT IN YOUR ACCOUNT? ");
        int n = sc.nextInt();

        System.out.print("WHAT IS THE ANNUAL INTEREST RATE (IN %)? ");
        double rPercent = sc.nextDouble();

        double r = rPercent / 100.0;

        double P = F / Math.pow(1 + r, n);

        System.out.println();
        System.out.println("THE AMOUNT YOU NEED TO DEPOSIT TODAY IS RM " + P);
    }
}
