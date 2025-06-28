package Tasks.Task24thJune;

import java.util.Scanner;

public class Factorial_While {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number to find its factorial");
        int num= sc.nextInt();

        int fact=1;
        int i=1;

        if(num<0){
            System.out.println("Factorial is not defined for negative numbers");
        } else {
            while ( i<=num){
                fact = fact * i;
                i++;
            }
            System.out.println("The factorial of the number" + num + "is:" + fact);
        }
        sc.close();
    }
}
