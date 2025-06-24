package Tasks.Task20thJune;

import java.util.Scanner;

public class LoanEligibilityCheck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the age");
        int age= sc.nextInt();

        System.out.println("Enter Salary");
        double salary=sc.nextDouble();

        System.out.println("Enter Credit Score");
        int creditScore=sc.nextInt();

        boolean isEligible= true;

        // Age Validation

        if (age<=0){
            System.out.println("❌ Invalid input: Age must be positive.");
            isEligible=false;
        } else if (age <18) {
            System.out.println("❌ Not eligible: Must be at least 18 years old.");
            isEligible=false;
        } else if (age>80) {
            System.out.println("❌ Not eligible: Age cannot exceed 80 years.");
            isEligible=false;
        }

        // Salary validation
        if (salary <=0){
            System.out.println("❌ Invalid input: Salary must be a positive number.");
            isEligible=false;
        } else if (salary <30000) {
            System.out.println("❌ Not eligible: Minimum salary must be ₹30,000.");
            isEligible=false;
        }

        //Credit Score Validation:
        if (creditScore <=0){
            System.out.println("❌ Invalid input: Credit Score must be positive.");
            isEligible=false;
        } else if (creditScore <650) {
            System.out.println("❌ Not eligible: Credit score must be at least 650.");
            isEligible=false;
        } else if (creditScore> 850) {
            System.out.println("❌ Invalid input: Credit score cannot exceed 850.");
            isEligible=false;
        }

        // Final result
        if (isEligible){
            System.out.println("✅ Congratulations! You are eligible for a loan.");
        } else{
            System.out.println("Loan eligibility check failed.");
        }


        sc.close();
    }
}
