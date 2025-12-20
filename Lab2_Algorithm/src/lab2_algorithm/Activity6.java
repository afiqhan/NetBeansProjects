/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2_algorithm;
/**
 *
 * @author AFIQ HANIF
 */
public class Activity6 {

    public static void main(String[] args) {

        double kmh;

        System.out.println("Miles Per Hour\tKilometer Per Hour");
        System.out.println("----------------------------------");

        for (int mph = 60; mph <= 130; mph += 10) {
            kmh = mph / 0.6214;
            System.out.printf("%d\t\t%.2f%n", mph, kmh);
        }
    }
}