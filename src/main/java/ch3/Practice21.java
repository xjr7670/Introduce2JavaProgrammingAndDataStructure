package com.xjr7670.ch3;

import java.util.Scanner;

/**
 * Find out the day of week
 */

public class Practice21 {
    public static void main(String[] args) {
        // 1. Obtain user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year: (e.g., 2012): ");
        int year = input.nextInt();
        System.out.println("Enter month: 1-12:");
        int month = input.nextInt();
        System.out.println("Enter the day of the month: 1-31: ");
        int q = input.nextInt();

        // 2. Estimate all value
        if (month == 1) {
            month = 13;
            year = year - 1;
        } else if (month == 2) {
            month = 14;
            year = year - 1;
        }

        int j = year / 100;
        int k = year % 100;

        int h = (q + (26 * (month + 1) / 10) + k + k / 4 + j / 4 + 5 * j) % 7;

        // 3. Display result
        System.out.print("Day of the week is ");
        switch (h) {
            case 0:
                System.out.println("Saturday");
                break;
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            default:
                System.out.println("invalid!");
        }
    }
}
