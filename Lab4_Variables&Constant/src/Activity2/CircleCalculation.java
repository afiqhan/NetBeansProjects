/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity2;
/**
 *
 * @author AFIQ HANIF
 * 
 */
import javax.swing.JOptionPane;
public class CircleCalculation {

    public static void main(String[] args) {

        final double PI = 3.14159;

        String radiusStr = JOptionPane.showInputDialog(
                "Enter the radius of the circle:");

        double radius = Double.parseDouble(radiusStr);

        double diameter = 2 * radius;
        double circumference = 2 * PI * radius;
        double area = PI * radius * radius;

        String message = "Diameter = " + diameter
                + "\nCircumference = " + circumference
                + "\nArea = " + area;

        JOptionPane.showMessageDialog(null, message);
    }
}
