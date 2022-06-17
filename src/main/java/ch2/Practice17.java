package ch2;

import java.util.Scanner;

/**
 * Compute the wind chill temperature
 */

public class Practice17 {
    public static void main(String[] args) {
        // 1. Obtain the temperature in Fahrenheit and the wind speed in miles per hour(>=2)
        System.out.println("Enter the temperature in Fahrenheit between -58℉ and 41℉");
        Scanner input = new Scanner(System.in);
        float temperature = input.nextFloat();
        System.out.println("Enter the wind speed (>=2) in miles per hour: ");
        float speed = input.nextFloat();
        // 2. Compute the wind chill index
        double index = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(speed, 0.16) + 0.4275 * temperature * Math.pow(speed, 0.16);
        // 3. Show the result
        System.out.printf("The wind chill index is %f", index);
    }
}
