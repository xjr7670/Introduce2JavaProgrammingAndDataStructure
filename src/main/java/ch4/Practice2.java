package ch4;

import java.util.Scanner;

/**
 * Great circle distance
 */

public class Practice2 {
    public static void main(String[] args) {
        // 1. Prompt user to enter two point's coordinates
        Scanner input = new Scanner(System.in);
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        float x1 = input.nextFloat();
        float y1 = input.nextFloat();
        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        float x2 = input.nextFloat();
        float y2 = input.nextFloat();

        // 2. Compute the distance
        double x1InRadians = Math.toRadians(x1);
        double y1InRadians = Math.toRadians(y1);
        double x2InRadians = Math.toRadians(x2);
        double y2InRadians = Math.toRadians(y2);

        double temp = Math.sin(x1InRadians) * Math.sin(x2InRadians) + Math.cos(x1InRadians) * Math.cos(x2InRadians) * Math.cos(y1InRadians - y2InRadians);
        double distance = 6371.01 * Math.acos(temp);

        // 3. Display result
        System.out.printf("The distance between the two points is %f km", distance);
    }
}
