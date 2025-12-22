/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity6;

/**
 *
 * @author AFIQ HANIF
 */
import javax.swing.JOptionPane;
public class CalculateTotalPrice {
     public static void main(String[] args) {

        String priceInput = JOptionPane.showInputDialog(
                "Enter the price of the product:");
        double price = Double.parseDouble(priceInput);

        double salesTax = price * 0.06;
        double totalCost = price + salesTax;

        JOptionPane.showMessageDialog(null,
                "Total cost of the product = " + totalCost);
    }
}
