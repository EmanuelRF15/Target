public class Fibonacci {
    public static boolean isFibonacci(int n) {
        if (n < 0) {
            return false;
        } else {
            int a = 0;

            int temp;
            for (int b = 1; a < n; b += temp) {
                temp = a;
                a = b;
            }

            return a == n;
        }
    }
}