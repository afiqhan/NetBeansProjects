/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity5;
/**
 *
 * @author AFIQ HANIF
 */
import javax.swing.JOptionPane;

public class BMIcalculation {
        public static void main(String[] args) {

        String weightInput = JOptionPane.showInputDialog(
                "Enter your weight in kilograms:");
        double weight = Double.parseDouble(weightInput);

        String heightInput = JOptionPane.showInputDialog(
                "Enter your height in meters:");
        double height = Double.parseDouble(heightInput);

        double bmi = weight / (height * height);

        JOptionPane.showMessageDialog(null,
                "Your BMI is " + bmi);
    }
}


