package ch5;

/**
 * Conversion from square meter to ping
 */

public class Practice6 {
    public static void main(String[] args) {
        // print table title
        System.out.println("Ping\tSquare meter\t|\tSquare meter\tPing");
        double squareMeter = 0.0, ping = 0.0;
        for (int p = 10, s = 30; p <= 80; p += 5, s += 5) {
            squareMeter = p * 3.305;
            ping = s / 3.305;
            System.out.printf("%d\t\t%12.3f\t|\t%d\t\t%12.3f\n", p, squareMeter, s, ping);
        }
    }
}
