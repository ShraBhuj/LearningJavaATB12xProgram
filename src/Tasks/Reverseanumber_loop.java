package Tasks;

import java.util.Scanner;

// Task 25th May | Switch HackerRank Program
//Reverse the number using for loop. (In - 12345, Out - 54321)

public class Reverseanumber_loop {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= sc.nextInt();

        int rev=0;

        for(; num!=0; num=num/10)
        {
            int digit= num%10;
            rev= rev*10+ digit;
        }
        System.out.println("Reversed number:"+ rev);
    }
}
