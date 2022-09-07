package ch6;

public class TestPractice27 {
    public static void main(String[] args) {
        final int LINE_LENGTH = 10;
        int count = 0, num = 10;
        while (count < 120) {
            if (Practice27.isPrime(num) && Practice27.isPrime(Practice27.reverseNumber(num))) {
                ++count;
                System.out.print(num);
                if (count % LINE_LENGTH == 0) {
                    System.out.println();
                } else {
                    System.out.print(" ");
                }
            }
            ++num;
        }
    }
}
