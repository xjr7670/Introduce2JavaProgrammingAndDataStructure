package ch6;

/**
 * Phone keypads
 */

public class Practice21 {
    public static int getNumber(char uppercaseLetter) {
        int left = uppercaseLetter - 64;
        if (left >= 19) {
            --left;
        }
        if (left == 25) {
            return 9;
        }
        return (int) Math.ceil(left / 3.0) + 1;
    }
}
