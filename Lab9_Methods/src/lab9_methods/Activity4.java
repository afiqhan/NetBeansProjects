/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9_methods;

/**
 *
 * @author AFIQ HANIF
 */
import java.util.Scanner;

public class Activity4 {

    static int[] scores = new int[5];
    static char[] grades = new char[5];

    public static void main(String[] args) {

        read_Input();
        identify_Grade();
        double average = calculate_Average();

        System.out.println("\nSubject Grades:");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Subject " + (i + 1)
                    + ": Score = " + scores[i]
                    + ", Grade = " + grades[i]);
        }

        System.out.printf("\nAverage Score = %.2f%n", average);
    }

    // Method to read input
    public static void read_Input() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter score for subject " + (i + 1) + ": ");
            scores[i] = sc.nextInt();
        }
    }

    // Method to identify grades
    public static void identify_Grade() {
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 80) {
                grades[i] = 'A';
            } else if (scores[i] >= 70) {
                grades[i] = 'B';
            } else if (scores[i] >= 50) {
                grades[i] = 'C';
            } else if (scores[i] >= 40) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }
    }

    // Method to calculate average
    public static double calculate_Average() {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }
}
