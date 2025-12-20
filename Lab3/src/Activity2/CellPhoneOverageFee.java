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

public class CellPhoneOverageFee {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("****************************************");
        System.out.println("MY CELL PHONE OVERAGE FEE");
        System.out.println("****************************************");

        System.out.print("ENTER THE NUMBER OF EXCESS MINUTES: ");
        int excessMinutes = sc.nextInt();

        double overageFee = excessMinutes * 0.35;

        System.out.println("OVERAGE FEE = RM " + overageFee);
    }
}

