import java.util.*;

interface PalindromeStrategy {
    boolean check(String input);
    String name();
}

class TwoPointerStrategy implements PalindromeStrategy {

    public boolean check(String input) {
        String s = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public String name() {
        return "Two Pointer Strategy";
    }
}

class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {
        String s = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            stack.push(c);
        }

        for (char c : s.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public String name() {
        return "Stack Strategy";
    }
}

class DequeStrategy implements PalindromeStrategy {

    public boolean check(String input) {
        String s = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }

        return true;
    }

    public String name() {
        return "Deque Strategy";
    }
}

public class PalindromePerformanceApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        List<PalindromeStrategy> strategies = Arrays.asList(
                new TwoPointerStrategy(),
                new StackStrategy(),
                new DequeStrategy()
        );

        System.out.println("\nPerformance Results:");

        for (PalindromeStrategy strategy : strategies) {
            long startTime = System.nanoTime();
            boolean result = strategy.check(input);
            long endTime = System.nanoTime();

            long duration = endTime - startTime;

            System.out.println(strategy.name());
            System.out.println("Result: " + (result ? "Palindrome" : "Not a Palindrome"));
            System.out.println("Execution Time (ns): " + duration);
            System.out.println();
        }

        scanner.close();
    }
}
