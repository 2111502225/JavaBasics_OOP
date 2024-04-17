import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();
        
        String reversed = reverseString(input);
        
        System.out.println("Reversed string: " + reversed);
        
        scanner.close();
    }
    
    public static String reverseString(String str) {
        char[] originalChars = str.toCharArray();
        char[] reversedChars = new char[originalChars.length];
        
        for (int i = originalChars.length - 1, j = 0; i >= 0; i--, j++) {
            reversedChars[j] = originalChars[i];
        }
        
        return new String(reversedChars);
    }
}

