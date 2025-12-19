/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8_array;
/**
 *
 * @author S62993
 */
import java.util.Scanner;

public class Activity2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        int[] scores = new int[n];
        int best;

        // Input scores
        for (int i = 0; i < n; i++) {
            System.out.print("Enter score for student " + i + ": ");
            scores[i] = sc.nextInt();
        }

        // Find best score
        best = scores[0];
        for (int i = 1; i < n; i++) {
            if (scores[i] > best) {
                best = scores[i];
            }
        }

        // Display grades
        System.out.println("\nBest score is: " + best);
        for (int i = 0; i < n; i++) {
            char grade;

            if (scores[i] >= best - 10) {
                grade = 'A';
            } else if (scores[i] >= best - 20) {
                grade = 'B';
            } else if (scores[i] >= best - 30) {
                grade = 'C';
            } else if (scores[i] >= best - 40) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            System.out.println("Student " + i +
                    " score is " + scores[i] +
                    " and grade is " + grade);
        }
    }
}