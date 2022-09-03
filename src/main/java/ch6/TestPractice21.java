package ch6;

import java.util.Scanner;

public class TestPractice21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine().toUpperCase();
        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (c >= 65 && c <= 90) {
                System.out.print(Practice21.getNumber(c));
            } else {
                System.out.print(c);
            }
        }
    }
}
