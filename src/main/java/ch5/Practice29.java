package ch5;

import java.util.Scanner;

/**
 * Display calendars
 */

public class Practice29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter the days if the first day: ");
        int firstDay = input.nextInt();
        int totalDays = 0, monthDays = 0;

        for (int i = 1; i <= 12; i++) {
            System.out.println();
            System.out.println();
            if (i != 1) {
                totalDays += monthDays;
            }
            System.out.printf("%12s", " ");
            switch (i) {
                case 1:
                    monthDays = 31;
                    System.out.printf("January %d\n", year);
                    break;
                case 2:
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        monthDays = 29;
                    } else {
                        monthDays = 28;
                    }
                    System.out.printf("February %d\n", year);
                    break;
                case 3:
                    monthDays = 30;
                    System.out.printf("March %d\n", year);
                    break;
                case 4:
                    monthDays = 31;
                    System.out.printf("April %d\n", year);
                    break;
                case 5:
                    monthDays = 30;
                    System.out.printf("May %d\n", year);
                    break;
                case 6:
                    monthDays = 31;
                    System.out.printf("June %d\n", year);
                    break;
                case 7:
                    monthDays = 31;
                    System.out.printf("July %d\n", year);
                    break;
                case 8:
                    monthDays = 31;
                    System.out.printf("August %d\n", year);
                    break;
                case 9:
                    monthDays = 30;
                    System.out.printf("September %d\n", year);
                    break;
                case 10:
                    monthDays = 31;
                    System.out.printf("October %d\n", year);
                    break;
                case 11:
                    monthDays = 30;
                    System.out.printf("November %d\n", year);
                    break;
                case 12:
                    monthDays = 31;
                    System.out.printf("December %d\n", year);
            }
            System.out.printf("%5s%5s%5s%5s%5s%5s%5s\n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
            System.out.println("--------------------------------------");

            int weekday = (firstDay + totalDays) % 7;
            final int weekLength = 7;
            int count = 0;
            while (weekday > 0) {
                System.out.printf("%5s", " ");
                --weekday;
                ++count;
            }
            for (int d = 1; d <= monthDays; d++) {
                System.out.printf("%5d", d);
                ++count;
                if (count == weekLength) {
                    System.out.println();
                    count = 0;
                }
            }

        }
    }
}
