package ch2;

import java.util.Scanner;

/**
 * Compute the energy
 */

public class Practice10 {
    public static void main(String[] args) {
        // 1. Obtain the user's input
        System.out.println("Enter the amount of water in kilograms: ");
        Scanner input = new Scanner(System.in);
        float waterAmount = input.nextFloat();
        float initTemperature = input.nextFloat();
        float finalTemperature = input.nextFloat();
        // 2. Compute the energy needs
        float q = waterAmount * (finalTemperature - initTemperature) * 4184;
        // 3. Show the result
        System.out.printf("The energy needed is %.3f", q);
    }
}
