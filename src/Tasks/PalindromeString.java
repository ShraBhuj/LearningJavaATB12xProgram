package Tasks;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {

        // input --> something in string --> datatype --> String
        // output --> something in string --> datatype --> String

        Scanner sc= new Scanner(System.in);

        //ip
        System.out.println("Enter a string: ");
        String input= sc.nextLine().toLowerCase();

        boolean isPalindrome=true;

        // Check for palindrome using charAt()
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Output the result
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
