package ch3;

/**
 * The random month
 */

public class Practice4 {
    public static void main(String[] args) {
        // 1. Generate a random number between 1 and 12
        int num = (int)(Math.random() * 13);

        // 2. Do a match
        String month = "";
        switch (num) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
        }
        System.out.printf("The number is %d, and the month is %s", num, month);
    }
}
