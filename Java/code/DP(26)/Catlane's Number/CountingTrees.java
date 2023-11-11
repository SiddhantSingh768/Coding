//Find number of all possible BSTs with given n nodes
import java.util.*;
public class CountingTrees {
    public static int countBST(int n){
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<n+1;i++){
            for(int j=0;j<i;j++){
                dp[i]+=dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(countBST(n));
    }
}