import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number to check if it's prime: ");
        int number = scanner.nextInt();

        // Check if the number is prime 
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is NOT a prime number.");
        }

        scanner.close();
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false; // 0, 1, and negative numbers are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) { // Check up to √num for efficiency
            if (num % i == 0) {
                return false; // If divisible, not a prime
            }
        }
        return true; // Prime number
    }
}
//output
//Enter a number to check if it's prime: 10
//10 is NOT a prime number.
