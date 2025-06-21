package Tasks.Task19thJune;

import java.util.Scanner;

public class VowelConsonantCheck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a character:");

        char ch= sc.next().toLowerCase().charAt(0); // convert to lowercase

        if((ch>='a') && (ch<='z')) {

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " eis a Vowel");
            } else {
                System.out.println(ch + " is a Consonant");
            }
        }else{
                System.out.println("Invalid input! Please enter an alphabet.");
            }

        sc.close();
    }
}
