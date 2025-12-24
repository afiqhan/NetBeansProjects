/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity4;

/**
 *
 * @author AFIQ HANIF
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentArraySort {
     public static void main(String[] args) {

        final int N = 10; // 10 rows as stated in the question

        // i. declare one dimensional arrays
        String[] names = new String[N];
        double[] marks = new double[N];
        String[] grades = new String[N];

        // ii. read the data one by one and assign to arrays
        try (Scanner sc = new Scanner(new File("student.txt"))) {

            int i = 0;
            while (sc.hasNext() && i < N) {
                names[i] = sc.next();       // student name (single word)
                marks[i] = sc.nextDouble(); // mark
                grades[i] = sc.next();      // grade
                i++;
            }

            if (i < N) {
                System.out.println("Warning: student.txt has less than " + N + " rows. Read only " + i + " rows.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: student.txt not found.");
            return;
        }

        // iii. sort by marks in descending order (bubble sort)
        for (int pass = 0; pass < N - 1; pass++) {
            for (int j = 0; j < N - 1 - pass; j++) {
                if (marks[j] < marks[j + 1]) {
                    // swap marks
                    double tempMark = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = tempMark;

                    // swap names (keep data aligned)
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;

                    // swap grades
                    String tempGrade = grades[j];
                    grades[j] = grades[j + 1];
                    grades[j + 1] = tempGrade;
                }
            }
        }

        // iv. calculate total marks and average
        double total = 0.0;
        for (int i = 0; i < N; i++) {
            total += marks[i];
        }
        double average = total / N;

        // v. display sorted list + total + average
        System.out.println("=== Sorted Students (Descending by Marks) ===");
        System.out.printf("%-15s %-10s %-5s%n", "Name", "Marks", "Grade");
        System.out.println("------------------------------------------");

        for (int i = 0; i < N; i++) {
            System.out.printf("%-15s %-10.2f %-5s%n", names[i], marks[i], grades[i]);
        }

        System.out.println("------------------------------------------");
        System.out.printf("Total Marks : %.2f%n", total);
        System.out.printf("Average     : %.2f%n", average);
    }
}
