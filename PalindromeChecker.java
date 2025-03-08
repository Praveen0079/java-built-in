import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();

        // Check if it's a palindrome
        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome.");
        }

        scanner.close();
    }

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase
        String cleanedStr = str.replaceAll("\\s+", "").toLowerCase();

        // Compare forward and backward
        int left = 0, right = cleanedStr.length() - 1;
        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true; // It's a palindrome
    }
}
//output
//Enter a string to check if it's a palindrome: nononononononononononononononon
//"nononononononononononononononon" is a palindrome.
