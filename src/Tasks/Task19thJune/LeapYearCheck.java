package Tasks.Task19thJune;

import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the year to be checked for leap year");
        int year= sc.nextInt();

        if((year % 4 == 0 && year % 100 !=0) || (year % 400 ==0)){
            System.out.println("It is a Leap year");
        }
        else {
            System.out.println("It is not a leap year");
        }
        sc.close();
    }
}
