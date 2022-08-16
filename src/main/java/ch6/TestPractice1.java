package ch6;

public class TestPractice1 {
    public static void main(String[] args) {
        int n;
        for (int i = 1; i <= 100; i++) {
            n = Practice1.getPentagonalNumber(i);
            System.out.printf("%7d", n);
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}
