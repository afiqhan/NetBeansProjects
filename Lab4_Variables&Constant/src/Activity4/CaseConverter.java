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

public class CaseConverter {

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog(
                "Enter a string:");

        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isLowerCase(c)) {
                result += Character.toUpperCase(c);
            } else if (Character.isUpperCase(c)) {
                result += Character.toLowerCase(c);
            } else {
                result += c;
            }
        }
        JOptionPane.showMessageDialog(null,
                "Converted String: " + result);
    }
}
