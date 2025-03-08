import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Define different date format patterns
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        // Print the current date in different formats
        System.out.println("Current date in format dd/MM/yyyy: " + currentDate.format(format1));
        System.out.println("Current date in format yyyy-MM-dd: " + currentDate.format(format2));
        System.out.println("Current date in format EEE, MMM dd, yyyy: " + currentDate.format(format3));
    }
}

//output
//Current date in format dd/MM/yyyy: 07/03/2025
//Current date in format yyyy-MM-dd: 2025-03-07
//Current date in format EEE, MMM dd, yyyy: Fri, Mar 07, 2025
