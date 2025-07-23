package Tasks.ALLTasks;

import java.util.Scanner;

//Task 25th May | Switch HackerRank Program
 //Count vowels and consonants in a String.
public class Vowels_n_C_in_String {
    public static void main(String[] args) {

        // Vowels are: a, e, i, o, u
        // Consonants   b, c, d, f, g, h, j, k, l, m, n, p, q, r, s, t, v, w, x, y and z
        //ip= string-> datatype

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");

        String input = sc.nextLine();

        // Convert string to lowercase for easier comparison
        input = input.toLowerCase();

        int vowels = 0, consonants = 0;

        // Iterate over each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if it's a letter
            if (ch >= 'a' && ch <= 'z') {
                // Check if it's a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++; // vowels = vowels + 1;

                } else {
                    consonants++; // a++ -->
                }
            }

        }
        // Output the result
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }
}
