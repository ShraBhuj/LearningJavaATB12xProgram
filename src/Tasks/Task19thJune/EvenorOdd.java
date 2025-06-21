package Tasks.Task19thJune;

import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number");

        int number= sc.nextInt();

        if (number %2 == 0){
            System.out.println(number+ "is an Even number");
        }
            else {
            System.out.println(number+ "is an Odd number");
        }
            sc.close();
    }
}
