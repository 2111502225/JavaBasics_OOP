import java.util.Scanner;
public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms for Fibonacci sequence: ");
        int numTerms = scanner.nextInt();

        // First two terms of Fibonacci sequence
        int firstTerm = 0, secondTerm = 1;

        System.out.println("Fibonacci sequence:");

        // Print the first and second terms
        System.out.print(firstTerm + " " + secondTerm + " ");

        // Generate the Fibonacci sequence for remaining terms
        for (int i = 3; i <= numTerms; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");

            // Update first and second terms for the next iteration
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        scanner.close();
    }
    
}
