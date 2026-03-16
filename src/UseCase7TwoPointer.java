import java.util.Scanner;
public class UseCase7TwoPointer {
    public static boolean twoPointerCheck(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("============================================================");
        System.out.println("         Welcome to Palindrome Checker App");
        System.out.println("============================================================");
        Scanner scanner = new Scanner(System.in);
        String choice = "yes";
        while (choice.equalsIgnoreCase("yes")) {
            System.out.print("Enter a word or sentence to check: ");
            String input = scanner.nextLine();
            String cleaned = input.toLowerCase().replaceAll("[^a-z0-9]", "");
            boolean isPalindrome = twoPointerCheck(cleaned);
            System.out.println("Input          : " + input);
            System.out.println("Cleaned        : " + cleaned);
            System.out.println("Is Palindrome? : " + isPalindrome);
            System.out.print("Check another? (yes/no): ");
            choice = scanner.nextLine();
        }
        System.out.println("Thank you for using Palindrome Checker App!");
        scanner.close();
    }
}
