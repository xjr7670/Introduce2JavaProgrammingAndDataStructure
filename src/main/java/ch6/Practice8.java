package ch6;

/**
 * Conversions between mile and kilometer
 */

public class Practice8 {
    /** Convert from Mile to kilometer */
    public static double mileToKilometer(double mile) {
        return mile * 1.609;
    }

    /** Convert from Kilometer to Mile */
    public static double kilometerToMile(double kilometer) {
        return kilometer / 1.609;
    }
}
