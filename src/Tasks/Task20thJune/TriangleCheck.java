package Tasks.Task20thJune;

import java.util.Scanner;

public class TriangleCheck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter side A");
        int a= sc.nextInt();

        System.out.println("Enter side B");
        int b=sc.nextInt();

        System.out.println("Enter side C");
        int c=sc.nextInt();

        if(a + b >c && b + c> a && c + a> b){
            System.out.println("The triangle is valid");
        } else {
            System.out.println("Invalid triangle");
        }
        sc.close();
    }
}
