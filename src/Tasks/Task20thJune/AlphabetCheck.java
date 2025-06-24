package Tasks.Task20thJune;

import java.util.Scanner;

public class AlphabetCheck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an character");

        char ch=sc.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z')){
            System.out.println("It is an alphabet");
        } else {
            System.out.println("Its not a valid alphabet");
        }
        sc.close();
    }
}
