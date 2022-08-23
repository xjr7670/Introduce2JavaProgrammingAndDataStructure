package ch6;

/**
 * Financial application: compute the future investment value
 */

public class Practice7 {
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }
}
