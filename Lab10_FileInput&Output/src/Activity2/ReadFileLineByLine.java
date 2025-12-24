/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author MUHAMMAD AFIQ HANIF
 */
public class ReadFileLineByLine {

    public static void main(String[] args) {

        try {
            try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
                String line;

                System.out.println("=== CONTENT OF input.txt ===");

                // Read file line by line
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }

}
