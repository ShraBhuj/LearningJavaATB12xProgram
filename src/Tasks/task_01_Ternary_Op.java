package Tasks;

import java.util.Scanner;

public class task_01_Ternary_Op {
    public static void main(String[] args) {
       // int num=5;
        Scanner sc= new Scanner(System.in); // ip from user

        int num=sc.nextInt();

        String checking= ((num % 2) == 0) ? "is Even" : "is Odd";
        System.out.println(num+" "+checking);
    }
}
