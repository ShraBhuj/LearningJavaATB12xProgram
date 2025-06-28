package Tasks.Task24thJune;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number to be checked if Prime Number");
        int num=sc.nextInt();

        boolean isPrime=true;

        if (num<=1){
            isPrime=false;
        } else {
            for (int i=2;i< num;i++){
                if ( num % 2 ==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if (isPrime){
            System.out.println("Is a Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
    }
}
