package ch6;

import java.util.Scanner;

public class TestPractice6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        Practice6.displayPattern(num);
    }
}
