package lab8_array;
import java.util.Scanner;
public class Activity1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];
        int max;

        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter integer value " + (i + 1) + ": ");
            num[i] = sc.nextInt();
        }

        max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println("\nList of array:");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

        System.out.println("\n\nMaximum value = " + max);
    }
}
