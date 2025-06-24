package Tasks.Task20thJune;

import java.util.Scanner;

public class PrimeNoCheck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to be checked if prime");

        int num= sc.nextInt();
        int count=0;

        if (num<=1){
            System.out.println(num + " 0is not a prime number");
        } else {
            for (int i=1; i<=num;i++)
            {
                if (num % i==0){
                    count++;
                }

            }
            if (count ==2){
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number");
            }
        }
         sc.close();

    }
}
