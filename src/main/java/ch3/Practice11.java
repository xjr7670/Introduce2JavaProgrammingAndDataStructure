package ch3;

import java.util.Scanner;

/**
 *
 */

public class Practice11 {
    public static void main(String[] args) {
        // 1. Obtain the month and year
        System.out.println("Enter the month and year: ");
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        int year = input.nextInt();

        // 2. Get days of the specific month
        boolean isLeapYear = false;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeapYear = true;
        }

        int days = 0;
        String monthInEng = "";
        switch (month) {
            case 1:
                days = 31;
                monthInEng = "January";
                break;
            case 3:
                days = 31;
                monthInEng = "March";
                break;
            case 5:
                days =31;
                monthInEng = "May";
                break;
            case 7:
                days = 31;
                monthInEng = "July";
                break;
            case 8:
                days = 31;
                monthInEng = "August";
                break;
            case 10:
                days = 31;
                monthInEng = "October";
                break;
            case 12:
                days = 31;
                monthInEng = "December";
                break;
            case 2:
                days = 28;
                if (isLeapYear) {
                    days = 29;
                }
                monthInEng = "February";
                break;
            case 4:
                days = 30;
                monthInEng = "April";
                break;
            case 6:
                days = 30;
                monthInEng = "June";
                break;
            case 9:
                days = 30;
                monthInEng = "September";
                break;
            case 11:
                days = 30;
                monthInEng = "November";
                break;
            default:
                days = 0;
                monthInEng = "";
        }

        // 3. Display result
        System.out.printf("%s %d has %d days\n", monthInEng, year, days);
    }
}
