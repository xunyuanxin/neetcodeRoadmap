package recursion;

public class ClimbingStairs {
    public static int climbingStairs(int n) {
        if (n == 1) { return 1; }
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }

    public static int timeOutClimbingStairs(int n) {
        if (n <= 2 && n > 0) { return n; }
        return timeOutClimbingStairs(n - 1) + timeOutClimbingStairs(n - 2);
    }
}
