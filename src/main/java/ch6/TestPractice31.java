package ch6;

import java.util.Scanner;

public class TestPractice31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a credit card number as a long integer: \n");
        long number = input.nextLong();
        boolean isValid = Practice31.isValid(number);
        if (isValid) {
            System.out.printf("%d is valid\n", number);
        } else {
            System.out.printf("%d is invalid\n", number);
        }
    }

}
