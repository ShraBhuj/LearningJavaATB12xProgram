package Tasks.Task20thJune;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number of units consumed: ");
        int units = sc.nextInt();
        double bill = 0;

        if(units <=0){
            System.out.println("❌ Invalid input: Units must be greater than zero.");
        } else{
            if (units <= 100){
                bill= units * 0.50;
            } else if (units <= 200) {
                bill = 100 * 0.50 + (units - 100) * 0.75;
            } else if (units <=300) {
                bill= 100 * 0.50 + 100 * 0.75 + (units - 200) * 1.20;
            } else {
                bill = 100 * 0.50 + 100 * 0.75 + 100 * 1.20 + (units - 300) * 1.50;
            }

            // 💰 Display final bill
            System.out.printf("🔋 Total Bill for %d units: ₹%.2f\n", units, bill);
        }
          sc.close();
        }
    }

