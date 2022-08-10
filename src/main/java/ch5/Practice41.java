package ch5;

import java.util.Scanner;

/**
 * Occurrence of max numbers
 */

public class Practice41 {
    public static void main(String[] args) {
        // 1. Get user's input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int num;
        int max = -10, count = 0;
        while (true) {
            num = input.nextInt();
            if (num > max) {
                max = num;
                count = 1;
            } else if (num == max) {
                ++count;
            }
            if (num == 0) {
                break;
            }
        }
        System.out.printf("The largest number is: %d\n", max);
        System.out.printf("The occurrence count of the largest number is %d\n", count);
    }
}
