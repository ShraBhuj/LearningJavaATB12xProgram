package Tasks.Task20thJune;

import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the salary: ");
        double salary= sc.nextDouble();

        System.out.println("Enter the years of experience: ");
        int years= sc.nextInt();

        double bonus=0;

        if (salary <=0){
            System.out.println("❌ Invalid salary. Salary must be positive.");
        } else if (years <0) {
            System.out.println("❌ Invalid experience. Years must be positive.");
        } else {

            if(years<1){
                bonus=0;
            } else if (years >= 1 && years <=3) {
                bonus= salary* 0.05;
            } else if (years >=4 && years <=6) {
                bonus= salary * 0.10;
            } else {
                bonus= salary * 0.15; // years >6
            }
            System.out.printf("Bonus Amount: %.2f", bonus);

        }
        sc.close();
    }
}
