package Tasks.Task19thJune;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the marks (0 to 100)");
        int marks= sc.nextInt();

        if (marks <0  || marks>100)
        {
            System.out.println("Invalid input. Marks must be between 0 to 100");
        } else {
            String grade="";
            if (marks >= 90 && marks <=100){
                grade= "A+";
            } else if (marks >=80 && marks <= 89) {
                grade= "A";
            } else if (marks >=70 && marks <= 79) {
                grade= "B";
            } else if (marks >=60 && marks <= 69) {
                grade= "C";
            } else if (marks >=50 && marks <= 59) {
                grade= "D";
            } else if (marks >=40 && marks <= 49) {
                grade= "E";
            } else {
                grade= "Fail";
            }
            System.out.println("Your Grade is:" +grade);
        }
        sc.close();
    }
}
