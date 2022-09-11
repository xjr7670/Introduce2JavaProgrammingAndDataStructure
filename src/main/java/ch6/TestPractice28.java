package ch6;


public class TestPractice28 {
    public static void main(String[] args) {
        // print table head
        System.out.printf("%6s\t%4s\n", "p", "2^p-1");
        System.out.println("--------------");
        int num = 2;
        while (num < 31) {
            if (Practice28.isPrime(num)) {
                System.out.printf("%6d\t%4d\n", num, Practice28.mersennePrime(num));
            }
            ++num; 
        }
    }
}
