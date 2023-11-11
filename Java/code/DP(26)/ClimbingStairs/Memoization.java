//find ways to climb n stairs if you can climb 1 or 2 stairs at a time
import java.util.*;
public class Memoization {
    public static int climbStairs(int n,int ways[]) {//O(n)
        if (n == 0 ) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if(ways[n] != -1) {//if we have already calculated the number of ways to climb n stairs
            return ways[n];
        }
        ways[n] = climbStairs(n-1,ways) + climbStairs(n-2,ways);
        return ways[n];
    }
    public static void main(String[] args) {
        int n = 8;
        int ways[]= new int[n+1];
        Arrays.fill(ways, -1);//-1,-1,-1
        int result = climbStairs(n,ways);
        System.out.println("The number of ways to climb " + n + " stairs is: " + result);
    }
}
