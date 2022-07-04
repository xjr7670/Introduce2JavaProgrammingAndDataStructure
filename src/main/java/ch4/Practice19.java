package ch4;

import java.util.Scanner;

/**
 * Check ISBN-10
 */

public class Practice19 {
    public static void main(String[] args) {
        // get user input
        System.out.println("Enter the first 9 digits of an ISBN as String: ");
        Scanner input = new Scanner(System.in);
        String isbn9 = input.nextLine();

        int number;
        int n0 = 0;
        if (isbn9.charAt(0) != '0') {
            n0 = Integer.parseInt(String.valueOf(isbn9.charAt(0)));
        }
        // split the digit
        number = Integer.parseInt(isbn9);

        int n8 = number % 10;
        number = number / 10;
        int n7 = number % 10;
        number = number / 10;
        int n6 = number % 10;
        number = number / 10;
        int n5 = number % 10;
        number = number / 10;
        int n4 = number % 10;
        number = number / 10;
        int n3 = number % 10;
        number = number / 10;
        int n2 = number % 10;
        number = number / 10;
        int n1 = number % 10;


        int n9 = (n0 + n1*2 + n2*3 + n3*4 + n4*5 + n5*6 + n6*7 + n7*8 + n8*9) % 11;
        System.out.printf("%d%d%d%d%d%d%d%d%d", n0, n1, n2, n3, n4, n5, n6, n7, n8);
        if (n9 == 10) {
            System.out.println("X");
        } else {
            System.out.println(n9);
        }
    }
}
