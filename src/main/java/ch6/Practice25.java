package ch6;

/**
 * Convert millseconds to hours, minutes, and seconds
 */

public class Practice25 {
    public static String convertMillis(long millis) {
        long second = millis / 1000;
        int hour = (int) second / 3600;
        int minute = (int) second / 60 % 60;
        int leftSecond = (int) second % 60;

        return String.format("%s:%s:%s", hour, minute, leftSecond);
    }
}
