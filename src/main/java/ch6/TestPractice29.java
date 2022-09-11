package ch6;


public class TestPractice29 {
    public static void main(String[] args) {
        int num = 2, lastOne = 2, currOne = 2;
        while (num < 1200) {
            if (Practice29.isPrime(num)) {
                lastOne = currOne;
                currOne = num;
                if (currOne - lastOne == 2) {
                    System.out.printf("(%d, %d)\n", lastOne, currOne);
                }
            }
            ++num;
        }
    }
}
