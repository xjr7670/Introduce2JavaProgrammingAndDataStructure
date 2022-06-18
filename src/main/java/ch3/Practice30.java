package ch3;

import java.util.Scanner;

/**
 * Display the hour using a 12-hour clock.
 */

public class Practice30 {
    public static void main(String[] args) {
        // Obtain the offset of GMT time
        System.out.println("Enter the time zone offset to GMT: ");
        Scanner input = new Scanner(System.in);
        int offset = input.nextInt();
        // Convert ti milliseconds
        int offsetMs = offset * 3600 * 1000;
        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();
        totalMilliseconds += offset;
        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;

        // Check am or pm
        String noon = "AM";
        if (currentHour >= 12) {
            noon = "PM";
            if (currentHour >= 13) {
                currentHour -= 12;
            }
        }

        System.out.printf("Current time is %d:%d:%d %s", currentHour, currentMinute, currentSeconds, noon);
    }
}
