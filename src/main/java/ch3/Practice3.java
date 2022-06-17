package ch3;

import java.util.Scanner;

/**
 * 3.3 求解2x2线性方程
 */

public class Practice3 {
    public static void main(String[] args) {
        // Obtain user input
        System.out.print("Enter a, b, c, d, e, f: ");
        Scanner input = new Scanner(System.in);
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();
        float d = input.nextFloat();
        float e = input.nextFloat();
        float f = input.nextFloat();

        // 2. Compute the ad-bc equation
        double adbc = a * d - b * c;
        if (adbc == 0) {
            System.out.println("The equation has no solution");
        } else {
            double x = (e * d - b * f) / adbc;
            double y = (a * f - e * c) / adbc;
            System.out.printf("x is %f and y is %f", x, y);
        }
    }
}
