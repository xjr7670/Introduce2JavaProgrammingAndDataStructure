package ch4;

import java.util.Scanner;

/**
 * Area of a hexagon
 */

public class Practice4 {
    public static void main(String[] args) {
        // 1. Obtain user's input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        float length = input.nextFloat();

        // 2. Compute the area
        double area = (6 * length * length) / (4 * Math.tan(Math.PI / 6));

        // 3. Display result
        System.out.printf("The area of the hexagon is %f.", area);
    }
}
