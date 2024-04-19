import java.util.Scanner;

public class Assignment18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Ask the user for input values
            System.out.print("Enter the dividend: ");
            int dividend = scanner.nextInt();

            System.out.print("Enter the divisor: ");
            int divisor = scanner.nextInt();

            // Attempt division
            int result = divide(dividend, divisor);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catch division by zero exception
            System.err.println("Error: Division by zero occurred.");
            e.printStackTrace();
        } catch (Exception e) {
            // Catch any other exceptions
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Close the scanner
            scanner.close();
        }
    }

    // Method to perform division and throw an exception if the divisor is zero
    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return dividend / divisor;
    }
}

    

