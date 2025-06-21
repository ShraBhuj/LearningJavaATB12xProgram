package Tasks.Task19thJune;

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number:");
        double number= sc.nextDouble();

        if (number>0) {
            System.out.println(number + "is Positive number");
        }
            else if
                    (number<0){
                System.out.println(number +"is Negative number");
            }
            else {
            System.out.println("The number is zero");
        }
            sc.close();
        }
    }

