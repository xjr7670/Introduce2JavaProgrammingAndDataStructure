package ch5;

import java.util.Scanner;

/**
 * Process string
 */

public class Practice48 {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (i % 2 != 0 && c != ' ') {
                System.out.print(c);
            }
        }
        System.out.println();
    }
}
