package ch3;

import java.util.Scanner;

/**
 * Compute the ISBN number
 */

public class Practice9 {
    public static void main(String[] args) {
        // get user input
        System.out.println("Enter the first 9 digits of an ISBN as integer: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // split the digit
        int n0 = 0;

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


        int n9 = (n0*1 + n1*2 + n2*3 + n3*4 + n4*5 + n5*6 + n6*7 + n7*8 + n8*9) % 11;
        System.out.printf("%d%d%d%d%d%d%d%d%d", n0, n1, n2, n3, n4, n5, n6, n7, n8);
        if (n9 == 10) {
            System.out.println("X");
        } else {
            System.out.println(n9);
        }
    }
}
