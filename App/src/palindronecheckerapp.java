import java.util.Scanner;

public class PalindromeArrayCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char[] arr = input.toCharArray();

        int start = 0;
        int end = arr.length - 1;
        boolean palindrome = true;

        while (start < end) {
            if (arr[start] != arr[end]) {
                palindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (palindrome) {
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }

        sc.close();
    }
}
