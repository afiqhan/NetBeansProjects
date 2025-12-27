package Activity1;

public class Modify4 {
    public static void main(String[] args) {

        double tuition = 4000.0;
        int year = 1;

        // Calculate tuition after 10 years (do-while)
        do {
            tuition *= 1.05;
            year++;
        } while (year <= 10);

        System.out.printf("Tuition fee after 10 years: RM %.2f%n", tuition);

        tuition = 4000.0;
        double totalCost = 0;
        year = 1;

        // Calculate total cost for 4 years (do-while)
        do {
            totalCost += tuition;
            tuition *= 1.05;
            year++;
        } while (year <= 4);

        System.out.printf("Total cost for 4 years tuition: RM %.2f%n", totalCost);
    }
}
