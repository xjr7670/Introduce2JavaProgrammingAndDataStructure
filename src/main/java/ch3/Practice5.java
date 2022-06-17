package ch3;

import java.util.Scanner;

/**
 * Give a future date
 */

public class Practice5 {
    public static void main(String[] args) {
        // 1. Obtain user input
        System.out.print("Enter today's day: ");
        Scanner input = new Scanner(System.in);
        int today = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int elapsedDay = input.nextInt();

        // 2. Get the weekday
        int leave = (elapsedDay + today) % 7;
        String wDay = "";
        String fwDay = "";
        switch (today) {
            case 0:
                wDay = "Sunday";
                break;
            case 1:
                wDay = "Monday";
                break;
            case 2:
                wDay = "Tuesday";
                break;
            case 3:
                wDay = "Wednesday";
                break;
            case 4:
                wDay = "Thursday";
                break;
            case 5:
                wDay = "Friday";
                break;
            case 6:
                wDay = "Saturday";
                break;
        }
        switch (leave) {
            case 0:
                fwDay = "Sunday";
                break;
            case 1:
                fwDay = "Monday";
                break;
            case 2:
                fwDay = "Tuesday";
                break;
            case 3:
                fwDay = "Wednesday";
                break;
            case 4:
                fwDay = "Thursday";
                break;
            case 5:
                fwDay = "Friday";
                break;
            case 6:
                fwDay = "Saturday";
                break;
        }
        System.out.printf("Today is %s and the future day is %s", wDay, fwDay);
    }
}
