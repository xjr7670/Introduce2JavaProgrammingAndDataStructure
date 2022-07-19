package ch5;

/**
 * Find numbers divisible by 3 or 4, but not both
 */

public class Practice11 {
    public static void main(String[] args) {
        final int LING_LENGTH = 10;
        int count = 0;

        System.out.println("The numbers can divisible by 3 or 4 but not both are: ");
        for (int i = 100; i <= 200; i++) {
            if ((i % 3 == 0 || i % 4 == 0) && (i % 12 != 0)) {
                System.out.print(i);
                ++count;
                if (count == LING_LENGTH) {
                    System.out.println();
                    count = 0;
                } else {
                    System.out.print(" ");
                }
            }

        }
    }
}
