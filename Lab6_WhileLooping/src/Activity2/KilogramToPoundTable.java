/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity2;
/**
 *
 * @author AFIQ HANIF
 */
public class KilogramToPoundTable {
    public static void main(String[] args) {

        int kilogram = 1;
        double pounds;

        System.out.println("Kilograms\tPounds");

        while (kilogram <= 200) {
            pounds = kilogram * 2.2;
            System.out.printf("%d\t\t%.1f%n", kilogram, pounds);
            kilogram += 2;
        }
    }
}
