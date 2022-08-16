package ch6;

import java.util.Scanner;

public class TestPractice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = input.nextLong();
        System.out.printf("The sum of all digits in this number is: %d\n", Practice2.sumDigits(n));
    }
}
