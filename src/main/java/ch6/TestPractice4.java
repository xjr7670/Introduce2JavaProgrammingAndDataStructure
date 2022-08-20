package ch6;

import java.util.Scanner;

public class TestPractice4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.printf("The reversed number of %d is :", num);
        Practice4.reverse(num);
    }
}
