package Tasks.Task20thJune;

import java.util.Scanner;

public class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int balance=10000;

        System.out.println("Welcome to the ATM");
        System.out.println("Enter the amount to be withdrawn");
        int amount=sc.nextInt();

        if (amount<=0){
            System.out.println("Error: Amount must be greater than zero");
        } else if (amount % 100 !=0){
            System.out.println("Error: Amount must be in multiples of 100");
        } else if (amount > balance){
            System.out.println("Error: Insufficient balance");
        } else {
            balance= balance-amount;
            System.out.println("Withdrawal successful");
            System.out.println("Updated balance is: " + balance);


        }
        sc.close();

    }
}
