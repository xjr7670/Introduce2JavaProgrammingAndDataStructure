package ch6;

/**
 * Display numbers
 */

public class Practice12 {
    public static void printNumbers(int num1, int num2, int numberPerLine) {
        int count = 0;
        for (int i = num1; i <= num2; i++) {
            System.out.print(i);
            if (++count == numberPerLine) {
                System.out.println();
                count = 0;
            } else {
                System.out.print(" ");
            }
        }
    }
}
