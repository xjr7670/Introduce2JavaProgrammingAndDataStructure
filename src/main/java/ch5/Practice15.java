package ch5;

/**
 * Display the ASCII character table
 */

public class Practice15 {
    public static void main(String[] args) {

        final int LINE_LENGTH = 10;
        int count = 0;

        for (int i = 33; i <= 126; i++) {
            System.out.print((char) i);
            if (++count == LINE_LENGTH) {
                System.out.println();
                count = 0;
            } else {
                System.out.print(" ");
            }
        }
    }
}
