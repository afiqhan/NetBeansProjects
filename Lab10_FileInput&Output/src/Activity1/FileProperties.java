/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity1;
/**
 *
 * @author AFIQ HANIF
 */
import java.io.File;
import java.util.Date;

public class FileProperties {

    public static void main(String[] args) {

        // Fail asal
        File file = new File("input.txt");

        System.out.println("=== FILE PROPERTIES ===");

        // i. exists()
        System.out.println("File exists: " + file.exists());

        if (file.exists()) {

            // ii. length()
            System.out.println("File size (bytes): " + file.length());

            // iii. canRead()
            System.out.println("Can read: " + file.canRead());

            // iv. canWrite()
            System.out.println("Can write: " + file.canWrite());

            // v. isDirectory()
            System.out.println("Is directory: " + file.isDirectory());

            // vi. isFile()
            System.out.println("Is file: " + file.isFile());

            // vii. isAbsolute()
            System.out.println("Is absolute path: " + file.isAbsolute());

            // viii. isHidden()
            System.out.println("Is hidden: " + file.isHidden());

            // ix. getAbsolutePath()
            System.out.println("Absolute path: " + file.getAbsolutePath());

            // x. lastModified()
            Date lastModifiedDate = new Date(file.lastModified());
            System.out.println("Last modified: " + lastModifiedDate);

            // xi. renameTo()
            File newFile = new File("input_backup.txt");
            boolean renamed = file.renameTo(newFile);

            System.out.println("File renamed: " + renamed);

        } else {
            System.out.println("File not found!");
        }
    }
}

