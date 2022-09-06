package ch6;

/**
 * Display current date and time
 */

public class Practice24 {
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        double totalMinutes = totalSeconds / 60.0;
        double totalHours = totalMinutes / 60.0;
        double totalDays = totalHours / 24.0;

        int currYear = 1970;
        boolean isLeadYear = false;
        while (totalDays >= 365) {
            if ((currYear % 4 == 0 && currYear % 100 != 0) || (currYear % 400 == 0)) {
                totalDays -= 366;
                isLeadYear = true;
            } else {
                totalDays -= 365;
                isLeadYear = false;
            }
            ++currYear;
        }
        int currMonth = 1;
        double currDay;
        int FebDays = isLeadYear ? 29 : 28;
        while (true) {
            currDay = totalDays;
            switch (currMonth) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    totalDays -= 31;
                    break;
                case 2:
                    totalDays -= FebDays;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    totalDays -= 30;
                    break;
            }
            if (totalDays < 0) {
                break;
            } else {
                ++currMonth;
            }
        }

        System.out.printf("The current date is: %d-%d-%d\n", currYear, currMonth, (int) Math.ceil(currDay));

        double leftSeconds = (currDay - Math.floor(currDay)) * 24 * 60 * 60;
        int hour = (int) leftSeconds / 3600;
        int minute = (int) leftSeconds / 60 % 60;
        int second = (int) leftSeconds % 60;

        System.out.printf("The current UTC time is: %d:%d:%d\n", hour, minute, second);
    }
}
