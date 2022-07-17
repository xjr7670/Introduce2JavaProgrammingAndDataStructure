package ch5;

/**
 * Financial application: compute future tuition
 */

public class Practice7 {
    public static void main(String[] args) {
        double tuition = 10000;
        double rate = 0.06;
        double futureTuition = 0.0;
        double tuitionAfterTenYears = 0.0;
        for (int i = 1; i <= 14; i++) {
            tuition = tuition * (1 + rate);
            if (i == 10) {
                tuitionAfterTenYears = tuition;
            }
            if (i > 10) {
                futureTuition += tuition;
            }
        }
        System.out.printf("Tuition after 10 years is: %.3f\n", tuitionAfterTenYears);
        System.out.printf("Total cost of four years' after the tenth year: %.3f\n", futureTuition);
    }
}
