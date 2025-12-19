/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8_array;
/**
 *
 * @author S62993
 */
public class Activity4 {

    public static void main(String[] args) {

        // 2D array: 5 students, 4 marks each
        int[][] marks = {
            {78, 90, 40, 75},
            {90, 83, 75, 68},
            {40, 80, 53, 69},
            {75, 80, 98, 95},
            {64, 50, 41, 70}
        };

        // Calculate and display total marks for each student
        for (int i = 0; i < marks.length; i++) {
            int total = 0;

            for (int j = 0; j < marks[i].length; j++) {
                total += marks[i][j];
            }

            System.out.println("Student ID " + (i + 1)
                    + " total marks = " + total);
        }
    }
}

