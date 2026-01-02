package PayrollSystem;
import java.util.Scanner;

public class PayrollSystem {

    // Method to calculate overtime pay
    public static double calculateOvertimePay(int hours) {
        double overtimeRate = 10.0; // RM10 per hour
        return hours * overtimeRate;
    }

    // Method to calculate total salary
    public static double calculateSalary(double basicSalary, double overtimePay) {
        return basicSalary + overtimePay;
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        double basicSalary = input.nextDouble();

        System.out.print("Enter overtime hours: ");
        int hours = input.nextInt();

        double overtimePay = calculateOvertimePay(hours);
        double totalSalary = calculateSalary(basicSalary, overtimePay);

        System.out.println("Overtime Pay: RM " + overtimePay);
        System.out.println("Total Salary: RM " + totalSalary);

        input.close();
    }
}
