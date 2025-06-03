package Tasks;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to find its factorial: ");
        int num = scanner.nextInt();

        int fact = 1;  // Use long to handle large results

        // Factorial logic using for loop
        for (int i = 1; i <= num; i++) {
            fact =fact* i;  // same as factorial = factorial * i;
        }

        // Display result
        System.out.println("Factorial of " + num + " is: " + fact);

    }
}
