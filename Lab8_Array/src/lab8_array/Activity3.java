/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8_array;
/**
 *
 * @author S62993
 */
public class Activity3 {

    public static void main(String[] args) {

        double[] alpha = new double[50];

        for (int i = 0; i < 25; i++) {
            alpha[i] = Math.pow(i, 2);
        }

        for (int i = 25; i < 50; i++) {
            alpha[i] = 3 * i;
        }

        // Output 10 elements per line
        for (int i = 0; i < alpha.length; i++) {
            System.out.printf("%.1f ", alpha[i]);

            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}
