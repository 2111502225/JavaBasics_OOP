import java.util.Scanner;
public class Assignment20 {

    
        // Factorial calculation
        public static int factorial(int n) {
            if (n == 0) {
                return 1;
            } else {
                return n * factorial(n - 1);
            }
        }
    
        // Fibonacci series
        public static int fibonacci(int n) {
            if (n <= 1) {
                return n;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Ask user for a number
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
    
            // Calculate factorial
            int factorialResult = factorial(number);
            System.out.println("Factorial of " + number + " is: " + factorialResult);
    
            // Calculate Fibonacci series
            int fibonacciResult = fibonacci(number);
            System.out.println("Fibonacci series at position " + number + " is: " + fibonacciResult);
    
            scanner.close();
        }
    }
    
    
    

