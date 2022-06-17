package ch2;

import java.util.Scanner;

/**
 * Show the current time
 */

public class Practice8 {
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
        System.out.printf("Current time is %d:%d:%d", currentHour, currentMinute, currentSeconds);
    }
}
