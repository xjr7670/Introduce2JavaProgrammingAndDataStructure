package ch6;

/**
 * Count the letters in a string
 */

public class Practice20 {
    public static int countLetters(String s) {
        s = s.toLowerCase();
        int count = 0;
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c >= 97 && c <= 122) {
                ++count;
            }
        }
        return count;
    }
}
