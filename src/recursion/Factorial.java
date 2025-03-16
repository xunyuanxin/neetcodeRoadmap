package recursion;

public class Factorial {
    public static int factorial (int n) {
        if (n > 1) {
            return n * factorial(n - 1);
        } else {
            // base case: n = 0 or 1 is important!
            return 1;
        }
    }
}
