/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity1;
/**
 *
 * @author AFIQ HANIF
 */
import javax.swing.JOptionPane;

public class GrossPayJOptionPane {

    public static void main(String[] args) {

        String rateStr = JOptionPane.showInputDialog("Enter hourly rate:");
        double hourlyRate = Double.parseDouble(rateStr);

        String hoursStr = JOptionPane.showInputDialog("Enter hours worked:");
        double hoursWorked = Double.parseDouble(hoursStr);

        double grossPay = hourlyRate * hoursWorked;

        JOptionPane.showMessageDialog(null,
                String.format("Gross pay = RM%.2f", grossPay));
    }
}
