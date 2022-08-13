package ch5;

import java.util.Scanner;

/**
 * Reverse a string
 */

public class Practice46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        System.out.print("The reversed string is: ");
        for (int i = s.length()-1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }
}
