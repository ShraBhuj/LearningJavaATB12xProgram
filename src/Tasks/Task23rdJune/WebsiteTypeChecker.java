package Tasks.Task23rdJune;

import java.util.Scanner;

public class WebsiteTypeChecker {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the website URL: ");
        String url= sc.nextLine().trim().toLowerCase();

        String type;

        if (url.endsWith(".com")) {
            type = "Commercial website";
        } else if (url.endsWith(".org")) {
            type = "Non-profit organization";
        } else if (url.endsWith(".edu")) {
            type = "Educational institution";
        } else if (url.endsWith(".gov")) {
            type = "Government website";
        } else if (url.endsWith(".net")) {
            type = "Network-related website";
        } else if (url.endsWith(".info")) {
            type = "Informational website";
        } else {
            type = "Unknown or other types of websites";
        }

        System.out.println("🌐 The website type is: " + type);

        sc.close();
    }
}
