package ch5;

import java.util.Scanner;

/**
 * Display the first days of each month
 */

public class Practice28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter the days of the first day: ");
        int days = input.nextInt();
        int totalDay = 0;
        for (int i = 1; i <= 12; i++) {
            switch(i) {
                case 1:
                    System.out.printf("January 1, %d is ", year);
                    break;
                case 2:
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        totalDay += 29;
                    } else {
                        totalDay += 28;
                    }
                    System.out.printf("February 1, %d is ", year);
                    break;
                case 3:
                    totalDay += 31;
                    System.out.printf("March 1, %d is ", year);
                    break;
                case 4:
                    totalDay += 31;
                    System.out.printf("April 1, %d is ", year);
                    break;
                case 5:
                    totalDay += 30;
                    System.out.printf("May 1, %d is ", year);
                    break;
                case 6:
                    totalDay += 31;
                    System.out.printf("June 1, %d is ", year);
                    break;
                case 7:
                    totalDay += 30;
                    System.out.printf("July 1, %d is ", year);
                    break;
                case 8:
                    totalDay += 31;
                    System.out.printf("August 1, %d is ", year);
                    break;
                case 9:
                    totalDay += 31;
                    System.out.printf("September 1, %d is ", year);
                    break;
                case 10:
                    totalDay += 30;
                    System.out.printf("October 1, %d is ", year);
                    break;
                case 11:
                    totalDay += 31;
                    System.out.printf("November 1, %d is ", year);
                    break;
                case 12:
                    totalDay += 30;
                    System.out.printf("December 1, %d is ", year);
                    break;
            }

            int futureDay = (days + totalDay) % 7;
            boolean leap = false;

            switch (futureDay) {
                case 0:
                    System.out.println("Sunday");
                    break;
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
            }
        }

    }
}
