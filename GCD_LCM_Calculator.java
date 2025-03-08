import java.util.Scanner;

public class GCD_LCM_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Compute GCD and LCM
        int gcd = computeGCD(num1, num2);
        int lcm = computeLCM(num1, num2, gcd);

        // Display results
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);

        scanner.close();
    }

    // Function to calculate GCD using the Euclidean algorithm
    public static int computeGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate LCM using the formula: LCM(a, b) = (a * b) / GCD(a, b)
    public static int computeLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
}
/*
ouput
Enter the first number: 4
Enter the second number: 5
GCD of 4 and 5 is: 1
LCM of 4 and 5 is: 20
*/