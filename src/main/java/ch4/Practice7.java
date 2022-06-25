package ch4;

import java.util.Scanner;

/**
 * Corner point coordinates
 */

public class Practice7 {
    public static void main(String[] args) {
        // 1. determined how many angles will have
        int angles = 5;
        double angleDegree = 360.0 / angles;

        // 2. compute each point's coordinates
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the bounding circle: ");
        float r = input.nextFloat();

        double x1 = r * Math.cos(angleDegree * 1 * Math.PI / 180);
        double y1 = r * Math.sin(angleDegree * 1 * Math.PI / 180);
        double x2 = r * Math.cos(angleDegree * 2 * Math.PI / 180);
        double y2 = r * Math.sin(angleDegree * 2 * Math.PI / 180);
        double x3 = r * Math.cos(angleDegree * 3 * Math.PI / 180);
        double y3 = r * Math.sin(angleDegree * 3 * Math.PI / 180);
        double x4 = r * Math.cos(angleDegree * 4 * Math.PI / 180);
        double y4 = r * Math.sin(angleDegree * 4 * Math.PI / 180);
        double x5 = r * Math.cos(angleDegree * 5 * Math.PI / 180);
        double y5 = r * Math.sin(angleDegree * 5 * Math.PI / 180);

        // 3. display
        System.out.print("The coordinates of five points on the pentagon are: \n");
        System.out.printf("Point 1 is (%f, %f)\n", x1, y1);
        System.out.printf("Point 2 is (%f, %f)\n", x2, y2);
        System.out.printf("Point 3 is (%f, %f)\n", x3, y3);
        System.out.printf("Point 4 is (%f, %f)\n", x4, y4);
        System.out.printf("Point 5 is (%f, %f)\n", x5, y5);
    }
}
