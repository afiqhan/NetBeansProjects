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

public class CelsiusToFahrenheit {

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog(
                "Enter temperature in Celsius:");

        double celsius = Double.parseDouble(input);

        double fahrenheit = (9.0 / 5.0) * celsius + 32;

        JOptionPane.showMessageDialog(null,
                "Temperature in Fahrenheit = " + fahrenheit);
    }
}

