package Tasks.Task19thJune;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the age of the voter");

        int age= sc.nextInt();

        if(age >= 18)
        {
            System.out.println("Eligible to vote");
        }
        else if (age>=0){
            System.out.println("You are Not Eligible to vote.Minimum age is 18.");
        } else {
            System.out.println("Invalid age entered!");
        }
        sc.close();
    }
}
