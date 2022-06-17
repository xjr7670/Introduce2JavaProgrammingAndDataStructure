package ch2;

/**
 * Translate the Celsius to Fahrenheit.
 */

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        // 1. Read a double number of Celsius temperature from the console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a degree in Celsius: ");
        double celsius = scanner.nextDouble();
        // 2. Translate the Celsius temperature to Fahrenheit.
        double fahrenheit = (9.0 / 5) * celsius + 32;
        // 3. Print the result to the console
        System.out.print(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}
