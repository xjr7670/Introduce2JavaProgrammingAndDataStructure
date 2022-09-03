package ch6;

import java.util.Scanner;

public class TestPractice20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.printf("The number of letters in this string is: %d\n", Practice20.countLetters(str));
    }
}
