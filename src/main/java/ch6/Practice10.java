package ch6;

/**
 * Use the isPrime Method
 */

public class Practice10 {
    /** Check whether number is prime */
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0)  {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int n = 1; n < 10000; n++) {
            if (isPrime(n)) {
                System.out.println(n);
            }
        }
    }
}
