package ch5;

/**
 * Find numbers divisible by 3 and 4
 */

public class Practice10 {
    public static void main(String[] args) {
        // some const variable
        final int LINE_LENGTH = 10;
        int count = 0;
        for (int i = 100; i <= 1000; i++) {
            if (i % 12 == 0) {
                System.out.print(i);
                ++count;
            }
            if (count == 10) {
                System.out.println();
                count = 0;
            } else {
                System.out.print(" ");
            }
        }
    }
}
