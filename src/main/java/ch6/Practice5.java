package ch6;

/**
 * Sort three numbers
 */

public class Practice5 {
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double temp;
        if (num1 < num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num1 < num3) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if (num2 < num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        System.out.printf("The decreasing order of this three numbers is: %d, %d, %d\n", Math.round(num1), Math.round(num2), Math.round(num3));
    }
}
