package ch6;


public class Practice29 {
    public static boolean isPrime(int number) {
        boolean flag = true;
        int end = (int) Math.pow(number, 0.5);
        for (int n = 2; n <= end; n++) {
            if (number % n == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
