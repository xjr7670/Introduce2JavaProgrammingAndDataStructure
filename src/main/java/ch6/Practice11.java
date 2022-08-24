package ch6;

/**
 * Financial application: compute commissions
 */

public class Practice11 {
    public static double computeCommission(double salesAmount) {
        double ret;
        if (salesAmount <= 5000) {
            ret = salesAmount * 0.08;
        } else if (salesAmount > 5000 && salesAmount <= 10000) {
            ret = 400 + (salesAmount - 5000) * 0.1;
        } else {
            ret = 900 + (salesAmount - 10000) * 0.12;
        }

        return ret;
    }
}
