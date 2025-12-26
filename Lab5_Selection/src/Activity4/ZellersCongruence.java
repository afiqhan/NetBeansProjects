/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity4;

/**
 *
 * @author AFIQ HANIF
 */
import javax.swing.JOptionPane;
public class ZellersCongruence {
    public static void main(String[] args) {

        String dateInput = JOptionPane.showInputDialog(null,
                "Enter date (DD-MM-YYYY or DD/MM/YYYY):",
                "Activity 4", JOptionPane.QUESTION_MESSAGE);

        if (dateInput == null) return;

        String[] parts;

        if (dateInput.contains("-")) {
            parts = dateInput.split("-");
        } else if (dateInput.contains("/")) {
            parts = dateInput.split("/");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Invalid date format.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int q = Integer.parseInt(parts[0]); // day
        int m = Integer.parseInt(parts[1]); // month
        int y = Integer.parseInt(parts[2]); // year

        if (m == 1 || m == 2) {
            m += 12;
            y -= 1;
        }

        int k = y % 100;
        int j = y / 100;

        int h = (q + (13 * (m + 1) / 5) + k + (k / 4) + (j / 4) + (5 * j)) % 7;

        String dayName;

        switch (h) {
            case 0: dayName = "Saturday"; break;
            case 1: dayName = "Sunday"; break;
            case 2: dayName = "Monday"; break;
            case 3: dayName = "Tuesday"; break;
            case 4: dayName = "Wednesday"; break;
            case 5: dayName = "Thursday"; break;
            case 6: dayName = "Friday"; break;
            default: dayName = "Invalid"; break;
        }

        JOptionPane.showMessageDialog(null,
                "Date: " + dateInput + "\nDay: " + dayName,
                "Result", JOptionPane.INFORMATION_MESSAGE);
    }
}