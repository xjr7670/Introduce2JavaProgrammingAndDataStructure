package ch5;

/**
 * Display prime number between 2 and 1,200
 */

public class Practice20 {
    public static void main(String[] args) {
        boolean flag = false;
        final int LINE_LENGTH = 8;
        int count = 0;

        for (int i = 2; i <= 1200; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                flag = false;
                continue;
            } else {
                ++count;
                System.out.printf("%d ", i);
            }
            if (count == LINE_LENGTH) {
                count = 0;
                System.out.println();
            }
        }
    }
}
