package ch6;

/**
 * Occurrences of a specified character
 */

public class Practice23 {
    public static int count(String str, char a) {
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                ++cnt;
            }
        }
        return cnt;
    }
}
