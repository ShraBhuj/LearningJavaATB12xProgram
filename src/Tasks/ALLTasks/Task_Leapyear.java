package Tasks.ALLTasks;

import java.util.Scanner;

public class Task_Leapyear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Year:");
        int year = sc.nextInt();

        if((year%4==0) && !(year%100==0) ){
            System.out.print("Entered year is leap Year");
        }
        else if(year%400==0) {
            System.out.print("Entered year is  leap Year");
        }
        else  {
            System.out.print("Entered year is Not leap Year");
        }

    }
}
