package ch6;

import java.util.Scanner;

public class TestPractice25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a long integer for milliseconds: ");
        long millis = input.nextLong();
        System.out.printf("The time of this milliseconds is: %s\n", Practice25.convertMillis(millis));
    }
}
