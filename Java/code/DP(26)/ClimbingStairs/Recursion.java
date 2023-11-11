//find ways to climb n stairs if you can climb 1 or 2 stairs at a time
import java.util.*;
public class Recursion {
    public static int climbStairs(int n) {
        if (n == 0 ) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        return climbStairs(n-1) + climbStairs(n-2);
    }
    public static void main(String[] args) {
        int n = 6;
        int result = climbStairs(n);
        System.out.println("The number of ways to climb " + n + " stairs is: " + result);
    }
}
