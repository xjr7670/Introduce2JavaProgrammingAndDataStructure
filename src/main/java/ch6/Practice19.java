package ch6;

public class Practice19 {
    /** Return ture if the sum of every two sides is
     * greater than the third side. */
    public static boolean isValid(double side1, double side2, double side3) {
        boolean ret = true;
        if (side1 + side2 <= side3) {
            ret = false;
        }
        if (side1 + side3 <= side2) {
            ret = false;
        }
        if (side2 + side3 <= side1) {
            ret = false;
        }
        return ret;
    }

    /** Return the area of the triangle */
    public static double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
    }
}
