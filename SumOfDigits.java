import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        int sum = calculateSumOfDigits(number);
        System.out.println("Sum of digits in " + number + " is: " + sum);
        
        scanner.close();
    }
    
    public static int calculateSumOfDigits(int number) {
        int sum = 0;
        
        while (number != 0) {
            sum += number % 10; // Add the last digit to sum
            number /= 10; // Remove the last digit
        }
        
        return sum;
    }
}
