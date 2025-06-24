package Tasks.Task20thJune;

import java.util.Scanner;

public class NetSalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 🔢 Input: Basic Pay
        System.out.print("Enter Basic Pay: ₹");
        double basicPay = sc.nextDouble();

        // 🧮 Calculate components
        double hra = 0.20 * basicPay;           // HRA = 20% of Basic Pay
        double da = 0.10 * basicPay;            // DA = 10% of Basic Pay
        double grossSalary = basicPay + hra + da; // Gross = Basic + HRA + DA
        double tax = 0.10 * grossSalary;        // Tax = 10% of Gross
        double netSalary = grossSalary - tax;   // Net = Gross - Tax

        // 🧾 Display breakdown
        System.out.println("\n🧾 Salary Breakdown:");
        System.out.printf("Basic Pay      : ₹%.2f\n", basicPay);
        System.out.printf("HRA (20%%)      : ₹%.2f\n", hra);
        System.out.printf("DA (10%%)       : ₹%.2f\n", da);
        System.out.printf("Gross Salary   : ₹%.2f\n", grossSalary);
        System.out.printf("Tax Deduction  : ₹%.2f\n", tax);
        System.out.printf("✅ Net Salary   : ₹%.2f\n", netSalary);

        sc.close();
    }
}
