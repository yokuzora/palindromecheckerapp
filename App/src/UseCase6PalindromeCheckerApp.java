import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

/**
 * =========================================================
 * MAIN CLASS - UseCase6PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 6: Queue + Stack Fairness Check
 *
 * Description:
 * This class validates a palindrome using both Queue (FIFO)
 * and Stack (LIFO) to demonstrate their behavior.
 *
 * @author Developer
 * @version 6.0
 */

public class UseCase6PalindromeCheckerApp {

    /**
     * Application entry point for UC6.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Create Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Create Stack (LIFO)
        Stack<Character> stack = new Stack<>();

        // Insert into both structures
        for (char c : input.toCharArray()) {
            queue.add(c);     // enqueue
            stack.push(c);    // push
        }

        // Assume palindrome
        boolean isPalindrome = true;

        // Compare until queue is empty
        while (!queue.isEmpty()) {

            char fromQueue = queue.remove(); // dequeue (FIFO)
            char fromStack = stack.pop();    // pop (LIFO)

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // Output result
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);

        scanner.close();
    }
}