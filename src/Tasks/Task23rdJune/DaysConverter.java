package Tasks.Task23rdJune;

import java.util.Scanner;

public class DaysConverter {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number of days");
        int totalDays= sc.nextInt();

        if(totalDays <0){
            System.out.println("Number of days cannot be negative ");
        } else{
            int years= totalDays/365;
            int remainingDays= totalDays % 365;

            int months= remainingDays / 30;
            int days= remainingDays % 30;

            System.out.println("Converted: " + years + " years, " + months + " months, and " + days + " days.");
        }
        sc.close();
    }
}
