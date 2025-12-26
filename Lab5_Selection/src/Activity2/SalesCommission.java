/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity2;
/**
 *
 * @author AFIQ HANIF
 */
import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter total sales (RM): ");
        double sales = input.nextDouble();

        double rate;

        if (sales <= 10000) {
            rate = 0.10;
        } else if (sales <= 15000) {
            rate = 0.15;
        } else {
            rate = 0.20;
        }

        double commission = sales * rate;

        System.out.println("Sales Amount : RM " + sales);
        System.out.println("Commission Rate : " + (rate * 100) + "%");
        System.out.println("Commission Earned : RM " + commission);

        input.close();
    }
}