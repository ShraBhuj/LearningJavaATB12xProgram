package Tasks.Task20thJune;

import java.util.Scanner;

public class TravelEligibility {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the Age:");
        int age= sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the visa status (valid/invalid):");
        String visaStatus= sc.nextLine().toLowerCase();

        boolean isEligible= true;

        // Validation for age
        if (age < 0) {
            System.out.println("❌ Invalid age. Age must be a non-negative integer.");
            isEligible = false;
        }

        // ✅ Validation for visa status
        if (!visaStatus.equals("valid") && !visaStatus.equals("invalid")) {
            System.out.println("❌ Invalid visa status. Enter 'valid' or 'invalid'.");
            isEligible = false;
        }

        // ✅ Travel Eligibility Check
        if (isEligible) {
            if (age >= 18 && visaStatus.equals("valid")) {
                System.out.println("✅ Person is eligible to travel.");
            } else {
                System.out.println("🚫 Person is NOT eligible to travel.");
            }
        }

        sc.close();
    }
}
