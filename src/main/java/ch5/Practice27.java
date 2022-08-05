package ch5;

/**
 * Display leap years
 */

public class Practice27 {
    public static void main(String[] args) {
        boolean leap = false;
        int count = 0;
        final int LINE_LENGTH = 10;
        System.out.println("The leap year between 2014 and 2114 are: ");
        for (int i = 2014; i <= 2114; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                leap = true;
                System.out.printf("%d", i);
                ++count;
                if (count == LINE_LENGTH) {
                    System.out.println();
                    count = 0;
                } else {
                    System.out.print(" ");
                }
            }
        }
    }
}
