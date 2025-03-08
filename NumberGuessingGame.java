import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Think of a number between 1 and 100, and I'll try to guess it!");
        System.out.println("Respond with: 'high' (too high), 'low' (too low), or 'correct'."); 

        int low = 1, high = 100, guess;
        String feedback;

        while (low <= high) {
            guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "?");

            feedback = scanner.nextLine().toLowerCase(); // Get user feedback

            if (feedback.equals("correct")) {
                System.out.println("Yay! I guessed your number!");
                break;
            } else if (feedback.equals("high")) {
                high = guess - 1; // Adjust range
            } else if (feedback.equals("low")) {
                low = guess + 1; // Adjust range
            } else {
                System.out.println("Invalid input! Please respond with 'high', 'low', or 'correct'.");
            }
        }

        scanner.close();
    }

    // Function to generate a guess using binary search logic
    public static int generateGuess(int low, int high) {
        return (low + high) / 2; // Midpoint for efficient guessing
    }
}
//output
//Think of a number between 1 and 100, and I'll try to guess it!
//Respond with: 'high' (too high), 'low' (too low), or 'correct'.
//Is your number 50?
//high
//Is your number 25?
//low
//Is your number 37?
//low
//Is your number 43?
//low
//Is your number 46?
//high
//Is your number 44?
//low
//Is your number 45?
//correct
//Yay! I guessed your number!
