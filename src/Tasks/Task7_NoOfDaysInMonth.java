package Tasks;

import java.util.Scanner;

public class Task7_NoOfDaysInMonth {
    public static void main(String[] args) {

            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Enter the month number 1 - 12");
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Enter the year");

            if (scanner1.hasNextInt() && scanner2.hasNextInt()) {
                int month = scanner1.nextInt();
                int year = scanner2.nextInt();
                if (year > 1800 && year < 9999) {
                    int daysInFeb = 28;
                    if (month == 2) {
                        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                            daysInFeb = 29;
                        }
                    }
                    switch (month) {
                        case 1:
                            System.out.println("January : 31");
                            break;
                        case 2:
                            System.out.println("February " + daysInFeb);
                            break;
                        case 3:
                            System.out.println("March : 30");
                            break;
                        case 4:
                            System.out.println("April : 31");
                            break;
                        case 5:
                            System.out.println("30");
                            break;
                        case 6:
                            System.out.println("31");
                            break;
                        case 7:
                            System.out.println("30");
                            break;
                        case 8:
                            System.out.println("31");
                            break;
                        case 9:
                            System.out.println("30");
                            break;
                        case 10:
                            System.out.println("31");
                            break;
                        case 11:
                            System.out.println("30");
                            break;
                        case 12:
                            System.out.println("31");
                            break;
                        default:
                            System.out.println("Please enter a valid Month");

                    }
                } else {
                    System.out.println("Please enter a valid year");
                }

            } else {
                System.out.println("Invalid year or month");
            }


        }
    }

