package ch6;


public class TestPractice26 {
    public static void main(String[] args) {
        final int LINE_LENGTH = 10;
        int count = 0, num = 2;
        boolean isPrime, isPalindromic;
        while (count < 120) {
            isPrime = Practice26.isPrime(num);
            isPalindromic = Practice26.isPalindromic(num);
            if (isPalindromic && isPrime) {
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
