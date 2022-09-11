package ch6;


public class Practice30 {
    public static int roll() {
        final int BOTTOM = 1, TOP = 6;
        return (int) (BOTTOM + Math.random() * TOP);
    }
}
