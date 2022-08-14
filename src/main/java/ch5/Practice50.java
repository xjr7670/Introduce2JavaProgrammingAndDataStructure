package ch5;

import java.util.Scanner;

/**
 * Print multiplication table
 */

public class Practice50 {
    public static void main(String[] args) {
        int i = 1, j = 9, row = i;
        System.out.print("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        do {
            while (i <= j) {
                System.out.printf("%d*%d=%d ", i, row, i*row);
                i++;
            }
            System.out.println();
            row++;
            i = 1;
        } while (row <= j);
    }
}
