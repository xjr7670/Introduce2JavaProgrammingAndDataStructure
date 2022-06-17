package ch2;

/**
 * Compound interest
 */

public class Practice13 {
    public static void main(String[] args) {
        System.out.println("Enter the monthly saving amount: ");
        double oneMonthLater = 100 * (1 + 0.00417);
        double twoMonthsLater = (100 + oneMonthLater) * (1 + 1.00417);
        double threeMonthsLater = (100 + twoMonthsLater) * (1 + 1.00417);
        double fourMonthsLater = (100 + threeMonthsLater) * (1 + 1.00417);
        double fiveMonthsLater = (100 + fourMonthsLater) * (1 + 1.00417);
        double sixMonthsLater = (100 + fiveMonthsLater) * (1 + 1.00417);
        System.out.printf("After the sixth month, the account value is $%.3f", sixMonthsLater);
    }
}
