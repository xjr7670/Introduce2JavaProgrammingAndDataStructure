package com.xjr7670.ch3;

import java.util.Scanner;

/**
 * The wind chill index
 */

public class Practice20 {
    public static void main(String[] args) {
        // 1. Obtain the temperature in Fahrenheit and the wind speed in miles per hour
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        float temperature = input.nextFloat();
        System.out.print("Enter the wind speed in miles per hour: ");
        float speed = input.nextFloat();

        // 2. Estimate the temperature and the speed
        //    if it is regal then compute the wind chill index
        double wci = 0.0;
        if (temperature >= -58 && temperature <= 41 && speed >= 2) {
            wci = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(speed, 0.16) + 0.4275 * temperature * Math.pow(speed, 0.16);
        } else {
            System.out.println("The temperature or the speed is not a valid value.");
            System.exit(1);
        }

        // 3. Display the result
        System.out.printf("The wind chill index is %f", wci);
    }
}
