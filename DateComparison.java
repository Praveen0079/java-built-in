import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt before reading input
        System.out.print("Enter first date (yyyy-MM-dd): ");
        String firstDate = scanner.nextLine();

        System.out.print("Enter second date (yyyy-MM-dd): ");
        String secondDate = scanner.nextLine();

        // Convert Strings to LocalDate
        LocalDate first = LocalDate.parse(firstDate);
        LocalDate second = LocalDate.parse(secondDate);

        // Compare dates
        if (first.isBefore(second)) {
            System.out.println("The first date is before the second date.");
        } else if (first.isAfter(second)) {
            System.out.println("The first date is after the second date.");
        } else {
            System.out.println("Both dates are equal.");
        }

        scanner.close();
    }
}

//output
//Enter first date (yyyy-MM-dd): 2024-04-01
//Enter second date (yyyy-MM-dd): 2024-05-02
//The first date is before the second date.
