package Tasks.Task20thJune;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the a number");
        int num= sc.nextInt();

        int original= num;
        int sum=0;
        int digits= String.valueOf(num).length();

        while (num > 0) {
            int digit= num % 10;
            sum+= Math.pow(digit,digits);
            num /=10;
        }

         if (sum == original)
         {
             System.out.println(original + " is an Armstrong number.");
         } else
         {
             System.out.println(original + " is not an Armstrong number.");
         }
          sc.close();
    }
}
