package JavaCodeChallenge;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read a positive integer from the user
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Validate input
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Use BigInteger for large factorials
            BigInteger factorial = BigInteger.ONE;
            int i = 1;

            // Calculate factorial using while loop
            while (i <= number) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
                i++;
            }

            // Print result
            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        sc.close();
    }
}
