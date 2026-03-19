import java.util.Scanner;

public class UserInputPalindrome {

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

// Convert to lowercase to handle case-insensitivity
        str = str.toLowerCase();

        while (left < right) {
// Ignore non-alphanumeric characters (optional)
            if (!Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            } else if (!Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            } else {
                if (str.charAt(left) != str.charAt(right)) {
                    return false; // Mismatch found
                }
                left++;
                right--;
            }
        }

        return true; // All characters matched
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }

        scanner.close();
    }
}