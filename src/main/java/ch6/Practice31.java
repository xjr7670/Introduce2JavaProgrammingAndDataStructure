package ch6;

/**
 * Financial: credit card number validation
 */

public class Practice31 {
    /** Return true if the card number is valid */
    public static boolean isValid(long number) {
        boolean flag = false;
        int oddEvenNumSum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
        boolean isPrefixMatched = false;
        int prefix1 = (int) getPrefix(number, 1);
        int prefix2 = (int) getPrefix(number, 2);
        if (prefixMatched(number, prefix1) || prefixMatched(number, prefix2)) {
            isPrefixMatched = true;
        }
        if (getSize(number) >= 13 && getSize(number) <= 16 && oddEvenNumSum % 10 == 0 && isPrefixMatched) {
            flag = true;
        }

        return flag;
    }

    public static void main(String[] args) {
        long number = 4388576018410707L;
        System.out.printf("number: %d\n", number);
        // System.out.printf("sum of odd place: %d\n", sumOfOddPlace(number));
        System.out.printf("sum of even place: %d\n", sumOfDoubleEvenPlace(number));
    }

    /** Get the result from Step 2 */
    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        boolean even = false;
        while (number > 0) {
            if (even) {
                sum += getDigit((int) (number % 10 * 2));
                even = false;
            } else {
                even = true;
            }
            number /= 10;
        }
        return sum;
    }

    /** Return this number if it is a single digit, otherwise,
     * return the sum of the two digits
     */
    public static int getDigit(int number) {
        return number > 9 ? 1 + number % 10 : number;
    }

    /** Return sum of odd-place digits in number */
    public static int sumOfOddPlace(long number) {
        int sum = 0;
        boolean odd = true;
        while (number > 0) {
            if (odd) {
                sum += number % 10;
                odd = false;
            } else {
                odd = true;
            }
            number /= 10;
        }
        return sum;
    }

    /** Return true if the number d is a prefix for number */
    public static boolean prefixMatched(long number, int d) {
        boolean flag = true;
        String num1 = String.valueOf(number);
        String num2 = String.valueOf(d);
        for (int i = 0; i < num2.length(); i++) {
            if (num2.charAt(i) != num1.charAt(i)) {
                flag = false;
            }
        }

        return flag;
    }

    /** Return the number of digits in d */
    public static int getSize(long d) {
        return String.valueOf(d).length();
    }

    /** Return the first k number of digits from number. If the
     * number of digits in number is less than k, return number.
     */
    public static long getPrefix(long number, int k) {
        String num1 = String.valueOf(number);
        long ret = 0L;
        if (num1.length() < k) {
            ret = number;
        } else {
            ret = Long.parseLong(num1.substring(0, k));
        }
        return ret;
    }

}
