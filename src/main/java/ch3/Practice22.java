package com.xjr7670.ch3;

import java.util.Scanner;

/**
 * Check if a point is inside a circle
 */

public class Practice22 {
    public static void main(String[] args) {
        // 1. Obtain the point's coordinate
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        float x = input.nextFloat();
        float y = input.nextFloat();

        // 2. Compute the distance
        double distance = Math.pow(x*x + y*y, 0.5);

        // 3. Display result
        if (distance <= 10) {
            System.out.printf("Point (%f, %f) is in the circle.", x, y);
        } else {
            System.out.printf("Point (%f, %f) is not in the circle.", x, y);
        }
    }
}
