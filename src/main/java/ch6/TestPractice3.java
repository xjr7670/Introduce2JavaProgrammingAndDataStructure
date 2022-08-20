package ch6;

import java.util.Scanner;

public class TestPractice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        boolean palindrome = Practice3.isPalindrome(num);
        if (palindrome) {
            System.out.printf("%d is a palindrome number\n", num);
        } else {
            System.out.printf("%d is not a palindrome number\n", num);
        }
    }
}
