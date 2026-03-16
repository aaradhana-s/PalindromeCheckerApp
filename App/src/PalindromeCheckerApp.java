// Main class
public class PalindromeCheckerApp {

    // Entry point of the program
    public static void main(String[] args) {

        // Hardcoded string
        String word = "madam";

        // Flag to check palindrome
        boolean isPalindrome = true;

        int left = 0;
        int right = word.length() - 1;

        // Compare characters from both ends
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Print result
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}