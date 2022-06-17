package ch3;

import java.util.Scanner;

/**
 * 3.1 解一元二次方程
 */

public class Practice1 {
    public static void main(String[] args) {
        // 1. Obtain a, b, c
        System.out.print("Enter a, b, c: ");
        Scanner input = new Scanner(System.in);
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();

        // 2. Compute the discriminant
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        double r1 = (-b + Math.pow(discriminant, 0.5)) / 2 * a;
        if (discriminant > 0) {
            double r2 = (-b - Math.pow(discriminant, 0.5)) / 2 * a;
            System.out.printf("The equation has two roots %f and %f.\n", r1, r2);
        } else if (discriminant == 0) {
            System.out.printf("The equation has one root %f\n", r1);
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}
