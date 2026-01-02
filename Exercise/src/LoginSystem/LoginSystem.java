/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LoginSystem;

/**
 *
 * @author AFIQ HANIF
 */
import java.util.Scanner;

public class LoginSystem {

    public static boolean validatePassword(String password) {
        String correctPassword = "admin123";
        return password.equals(correctPassword);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter password: ");
        String userPassword = input.nextLine();

        if (validatePassword(userPassword)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Invalid password");
        }

        input.close();
    }
}

