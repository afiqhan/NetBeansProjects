/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity1;
/**
 *
 * @author AFIQ HANIF
 */
public class Modify5 {
    public static void main(String[] args) {

        double rent = 800.00;
        int building = 1;

        String[] months = {
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
        };

        int[] daysInMonth = {
                31, 28, 31, 30,
                31, 30, 31, 31,
                30, 31, 30, 31
        };

        // Building loop
        do {
            int unit = 1;

            // Unit loop
            do {
                int month = 0;

                // Month loop
                do {
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("Payment Coupon for " + months[month]);
                    System.out.println("Building No: " + building + " Unit No: " + unit);
                    System.out.printf("Amount of Rent: RM %.2f%n", rent);
                    System.out.println("Rent Due: " + daysInMonth[month] + "/" + (month + 1) + "/2016");
                    System.out.println("--------------------------------------------------------------");

                    month++;
                } while (month < 12);

                unit++;
            } while (unit <= 15);

            building++;
        } while (building <= 20);
    }
}
