import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AirthmeticOperation {
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        // Define a formatter for date input/output
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        // Get the date input from the user
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();
        
        // Parse the input date
        LocalDate date = LocalDate.parse(inputDate, formatter);
        
        // Perform date arithmetic
        LocalDate newDate = date.plusDays(7).plusMonths(1).plusYears(2); // Add 7 days, 1 month, 2 years
        newDate = newDate.minusWeeks(3); // Subtract 3 weeks
        
        // Display the final result
        System.out.println("Final date after calculations: " + newDate.format(formatter));
        
        // Close the scanner
        scanner.close();
    }
}

//output
//Enter a date (yyyy-MM-dd): 2024-05-10
//Final date after calculations: 2026-05-27
