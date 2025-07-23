package Tasks.ALLTasks;

import java.util.Scanner;

public class Task5_Triangle_Classification {
    public static void main(String[] args) {
        System.out.println("Enter the length of three sides of a Triangle");
        Scanner sc = new Scanner(System.in);
        System.out.println("side1");
        int side1 = sc.nextInt();
        System.out.println("side2");
        int side2 = sc.nextInt();
        System.out.println("side3");
        int side3 = sc.nextInt();

        if ( (side1 == side2) && (side2 == side3) )
        {
            System.out.println("This is equilateral triangle");
        } else if ((side1 == side2) && (side2 == side3)) {
            System.out.println("This is isoceles triangle");
        }
          else {
            System.out.println("This is scalene traingle");
        }
    }
}
