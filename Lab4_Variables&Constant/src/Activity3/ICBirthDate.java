/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity3;
/**
 *
 * @author AFIQ HANIF
 */
import javax.swing.JOptionPane;
import java.time.Year;

public class ICBirthDate {

    public static void main(String[] args) {

        String icNumber = JOptionPane.showInputDialog(
                "Enter your IC number (12 digits):");

        // Extract birth date parts
        int year = Integer.parseInt(icNumber.substring(0, 2));
        int month = Integer.parseInt(icNumber.substring(2, 4));
        int day = Integer.parseInt(icNumber.substring(4, 6));

        int currentYear = Year.now().getValue();
        int currentYearLastTwo = currentYear % 100;

        int fullYear;
        if (year <= currentYearLastTwo) {
            fullYear = 2000 + year;
        } else {
            fullYear = 1900 + year;
        }

        String birthDate = day + "-" + month + "-" + fullYear;
        int age = currentYear - fullYear;

        String message = "Birth Date: " + birthDate
                + "\nCurrent Age: " + age;

        JOptionPane.showMessageDialog(null, message);
    }
}
