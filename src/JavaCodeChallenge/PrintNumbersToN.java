package JavaCodeChallenge;

import java.util.Scanner;

public class PrintNumbersToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read N from user
        System.out.print("Enter a positive integer (N): ");
        int N = sc.nextInt();

        if (N < 1) {
            System.out.println("Please enter a number greater than 0.");
        } else {
            // Print numbers from 1 to N in one line
            System.out.println("\nNumbers from 1 to " + N + ":");
            for (int i = 1; i <= N; i++) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
