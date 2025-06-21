package JavaCodeChallenge;

import java.util.Scanner;

public class StarPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get number of rows from user
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        System.out.println("\nRight Triangle Pattern:");
        for (int i = 1; i <= n; i++) {
            // Print i stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to next line
        }

        System.out.println("\nPyramid Pattern:");
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to next line
        }

        sc.close();
    }
}
