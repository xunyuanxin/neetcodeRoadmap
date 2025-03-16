package recursion;

public class FibonacciSequence {
    public static int fibonacciNumber(int n) {
        if (n >= 0) {
            return switch (n) {
                case 0 -> 0;
                case 1 -> 1;
                default -> fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
            };
        } else {
            return 0;
        }
    }
}
