package ch5;

/**
 * Conversion from inch to centimeter
 */

public class Practice4 {
    public static void main(String[] args) {
        // print title
        System.out.println("Inches\t\tCentimeters");
        double centimeters = 0.0;
        for (int inches = 1; inches <= 10; inches++) {
            centimeters = inches * 2.54;
            System.out.printf("%d\t\t%.2f\n", inches, centimeters);
        }
    }
}
