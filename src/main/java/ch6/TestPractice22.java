package ch6;

import java.util.Scanner;

public class TestPractice22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.printf("The sqrt of %d is: %.3f\n", number, Practice22.sqrt(number));
    }
}
