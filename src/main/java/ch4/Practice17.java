package ch4;

import java.util.Scanner;

/**
 * Days of a month
 */

public class Practice17 {
    public static void main(String[] args) {
        // 1. Obtain user's input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        input.nextLine();
        System.out.print("Enter a month: ");
        String month = input.nextLine();

        // Check
        boolean leap = false;
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            leap = true;
        }
        int monthDays = 0;
        switch (month) {
            case "Jan":
            case "Mar":
            case "May":
            case "Jul":
            case "Aug":
            case "Oct":
            case "Dec":
                monthDays = 31;
                break;
            case "Feb":
                monthDays = leap ? 29 : 28;
                break;
            case "Apr":
            case "Jun":
            case "Sep":
            case "Nov":
                monthDays = 30;
                break;
            default:
                System.out.printf("%s is not a correct month name", month);
                System.exit(1);
        }

        System.out.printf("%s %d has %d days", month, year, monthDays);

    }
}
