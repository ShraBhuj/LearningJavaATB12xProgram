package JavaCodeChallenge;

public class MultiplicationTables {
    public static void main(String[] args) {
        System.out.println("Multiplication Tables (1 to 5):\n");

        for (int num = 1; num <= 5; num++) {
            System.out.println("Table of " + num + ":");

            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d × %d = %d%n", num, i, num * i);
            }

            System.out.println(); // Add a blank line between tables
        }
    }
}
