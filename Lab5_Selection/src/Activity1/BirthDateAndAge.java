/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Activity1;
/**
 *
 * @author AFIQ HANIF
 */
import javax.swing.JOptionPane;
public class BirthDateAndAge {

    public static void main(String[] args) {

        String ic = JOptionPane.showInputDialog(null,
                "Enter IC number (12 digits):", "Activity 1", JOptionPane.QUESTION_MESSAGE);

        if (ic == null) return;

        ic = ic.trim();

        if (ic.length() != 12 || !ic.matches("\\d{12}")) {
            JOptionPane.showMessageDialog(null,
                    "Invalid IC number. Please enter exactly 12 digits.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String yyStr = ic.substring(0, 2);
        String mmStr = ic.substring(2, 4);
        String ddStr = ic.substring(4, 6);

        int yy = Integer.parseInt(yyStr);
        int mm = Integer.parseInt(mmStr);
        int dd = Integer.parseInt(ddStr);

        int year;
        if (yy >= 20) {
            year = 1900 + yy;
        } else {
            year = 2000 + yy;
        }

        int currentYear = 2016;
        int currentMonth = 12;
        int currentDay = 27;

        int age = currentYear - year;
        if (currentMonth < mm || (currentMonth == mm && currentDay < dd)) {
            age--;
        }

        String birthDate = String.format("%s-%s-%04d", ddStr, mmStr, year);

        JOptionPane.showMessageDialog(null,
                "Birth Date: " + birthDate + "\nCurrent Age: " + age,
                "Result", JOptionPane.INFORMATION_MESSAGE);
    }
}