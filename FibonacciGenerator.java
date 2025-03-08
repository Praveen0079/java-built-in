import java.util.Scanner;

public class FibonacciGenerator {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter the number of Fibonacci terms: ");
        int terms = scanner.nextInt();

        // Validate input
        if (terms <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            generateFibonacci(terms);
        }

        scanner.close();
    }

    // Function to generate and print the Fibonacci sequence
    public static void generateFibonacci(int n) {
        int first = 0, second = 1;

        System.out.println("Fibonacci Sequence:");
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            // Calculate next term
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println(); // New line after sequence
    }
}
//output
//Enter the number of Fibonacci terms: 10
//Fibonacci Sequence:
//0 1 1 2 3 5 8 13 21 34

