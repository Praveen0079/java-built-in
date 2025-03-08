import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display menu for conversion choice
        System.out.println("Temperature Converter");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        // Perform the chosen conversion
        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.println(celsius + "°C is " + fahrenheit + "°F");
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.println(fahrenheit + "°F is " + celsius + "°C");
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        scanner.close();
    }

    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}

/*
output
1. Convert Celsius to Fahrenheit
2. Convert Fahrenheit to Celsius
Enter your choice (1 or 2): 2
Enter temperature in Fahrenheit: 100
100.0°F is 37.77777777777778°C
*/
