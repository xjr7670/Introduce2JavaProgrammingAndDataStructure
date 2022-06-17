package ch2;

import java.util.Scanner;

/**
 * Compute the distance of two point
 */

public class Practice15 {
    public static void main(String[] args) {
        // 1. Obtain the coordinate
        System.out.print("Enter x1 and y1:  ");
        Scanner input = new Scanner(System.in);
        float x1 = input.nextFloat();
        float y1 = input.nextFloat();
        System.out.println("Enter x2 and y2: ");
        float x2 = input.nextFloat();
        float y2 = input.nextFloat();
        // 2. Compute the distance
        double distance = Math.pow(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2), 0.5);
        // 3. Show the result
        System.out.printf("The distance between the two points is %f", distance);
    }
}
