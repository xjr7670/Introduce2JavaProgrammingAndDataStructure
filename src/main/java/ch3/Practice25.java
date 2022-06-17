package com.xjr7670.ch3;

import java.util.Scanner;

/**
 * Point of intersection
 */

public class Practice25 {
    public static void main(String[] args) {
        // 1. Obtain the coordinates of these four points
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        float x1 = input.nextFloat();
        float y1 = input.nextFloat();
        float x2 = input.nextFloat();
        float y2 = input.nextFloat();
        float x3 = input.nextFloat();
        float y3 = input.nextFloat();
        float x4 = input.nextFloat();
        float y4 = input.nextFloat();

        // 2. Check if these points have in intersection point.
        //    If they have, then compute that point.
        double a = y1 - y2;
        double b = -1 * (x1 - x2);
        double c = y3 - y4;
        double d = -1 * (x3 - x4);
        double e = (y1 - y2) * x1 - (x1 - x2) * y1;
        double f = (y3 - y4) * x3 - (x3 - x4) * y3;

        double adbc = a * d - b * c;
        double x = 0.0, y = 0.0;
        if (adbc == 0) {
            System.out.println("The two lines are parallel");
            System.exit(1);
        } else {
            x = (e * d - b * f) / adbc;
            y = (a * f - e * c) / adbc;
        }

        // 3. Display result
        System.out.printf("The intersection point is at (%f, %f)", x, y);
    }
}
