import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker");
        System.out.println("Welcome to Palindrome Checker");
        System.out.println("Welcome to Palindrome Checker");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String processedInput = input.replaceAll("\\s+", "").toLowerCase();

        String reversed = new StringBuilder(processedInput).reverse().toString();

        if (processedInput.equals(reversed)) {
            System.out.println("Result: It is a Palindrome ✅");
        } else {
            System.out.println("Result: It is NOT a Palindrome ❌");
        }

        scanner.close();
    }
}
