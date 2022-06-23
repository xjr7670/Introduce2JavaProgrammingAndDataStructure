package ch4;

/**
 * Random points on a circle
 */

public class Practice6 {
    public static void main(String[] args) {
        // 1. Generate a random angle
        double angle1 = 360 - 360 * Math.random();
        double angle2 = (360 - angle1) * Math.random();
        double angle3 = 360 - angle1 - angle2;

        // 2. Generate three points
        final int r = 40;
        double x1 = r * Math.cos(angle1 * Math.PI / 180);
        double y1 = r * Math.sin(angle1 * Math.PI / 180);
        double x2 = r * Math.cos(angle2 * Math.PI / 180);
        double y2 = r * Math.sin(angle2 * Math.PI / 180);
        double x3 = r * Math.cos(angle3 * Math.PI / 180);
        double y3 = r * Math.sin(angle3 * Math.PI / 180);

        // 3. Display result
        System.out.printf("Point 1 is (%f, %f)\n", x1, y1);
        System.out.printf("Point 2 is (%f, %f)\n", x2, y2);
        System.out.printf("Point 3 is (%f, %f)\n", x3, y3);
    }
}
