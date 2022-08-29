package ch6;

/**
 * Number of days in a year
 */

public class Practice16 {
    public static int numberOfDaysInAYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) ||  (year % 400 == 0)) {
            return 366;
        } else {
            return 365;
        }
    }
}
