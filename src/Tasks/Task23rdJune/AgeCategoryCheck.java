package Tasks.Task23rdJune;

import java.util.Scanner;

public class AgeCategoryCheck {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the age to be checked: ");
        int age= sc.nextInt();
        
        if (age <0){
            System.out.println("Enter a valid positive age to be checked");
        } else if ( age >=0 && age<=12) {
            System.out.println("You are A Child");
        } else if (age >=13 && age <=19) {
            System.out.println("You are A Teenager");
        } else if (age>=20 && age<=64) {
            System.out.println("You are An Adult");
        } else {
            System.out.println(" You are A Senior Citizen");
        }
        sc.close();
    }
}
