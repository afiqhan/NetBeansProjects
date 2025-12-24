/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity5;

/**
 *
 * @author AFIQ HANIF
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteResultToFile {

    public static void main(String[] args) {

        final int N = 10;

        // i. Declare one-dimensional arrays
        String[] names = new String[N];
        double[] marks = new double[N];
        String[] grades = new String[N];

        // ii. Read data from student.txt
        try (Scanner sc = new Scanner(new File("student.txt"))) {

            int i = 0;
            while (sc.hasNext() && i < N) {
                names[i] = sc.next();
                marks[i] = sc.nextDouble();
                grades[i] = sc.next();
                i++;
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: student.txt not found.");
            return;
        }

        // iii. Sort students by marks in descending order
        for (int pass = 0; pass < N - 1; pass++) {
            for (int j = 0; j < N - 1 - pass; j++) {
                if (marks[j] < marks[j + 1]) {

                    double tempMark = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = tempMark;

                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;

                    String tempGrade = grades[j];
                    grades[j] = grades[j + 1];
                    grades[j + 1] = tempGrade;
                }
            }
        }

        // iv. Calculate total and average
        double total = 0.0;
        for (int i = 0; i < N; i++) {
            total += marks[i];
        }
        double average = total / N;

        // v. Write output to result.txt
        try (PrintWriter out = new PrintWriter(new FileWriter("result.txt"))) {

            out.println("=== Sorted Students (Descending by Marks) ===");
            out.printf("%-15s %-10s %-5s%n", "Name", "Marks", "Grade");
            out.println("------------------------------------------");

            for (int i = 0; i < N; i++) {
                out.printf("%-15s %-10.2f %-5s%n",
                        names[i], marks[i], grades[i]);
            }

            out.println("------------------------------------------");
            out.printf("Total Marks : %.2f%n", total);
            out.printf("Average     : %.2f%n", average);

        } catch (IOException e) {
            System.out.println("Error writing to result.txt");
        }

        System.out.println("Result successfully written to result.txt");
    }
}

