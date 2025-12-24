package activity3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileWordByWord {

    public static void main(String[] args) {

        try {
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);

            // Read file word by word
            while (scanner.hasNext()) {
                System.out.println(scanner.next());
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error reading file.");
        }
    }
}
