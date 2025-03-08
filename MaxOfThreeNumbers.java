import java.util.Scanner;

public class MaxOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user inputs
        System.out.print("Enter the first number: ");
        int num1 = getUserInput(scanner);
 
        System.out.print("Enter the second number: ");
        int num2 = getUserInput(scanner);

        System.out.print("Enter the third number: ");
        int num3 = getUserInput(scanner);

        // Find and display the maximum number
        int max = findMax(num1, num2, num3);
        System.out.println("The maximum number is: " + max);

        scanner.close();
    }

    // Function to get an integer input from the user
    public static int getUserInput(Scanner scanner) {
        return scanner.nextInt();
    }

    // Function to find the maximum of three numbers
    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c)); // Uses Math.max for clean code
    }
}
/*
Ouput:
Enter the first number: 10
Enter the second number: 11
Enter the third number: 12
The maximum number is: 12
*/
