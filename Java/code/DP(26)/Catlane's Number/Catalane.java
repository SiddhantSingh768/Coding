import java.util.*;
public class Catalane {
    public static int catalanRec(int n){
        if(n==0 || n==1){
            return 1;
        }
        int res=0;
        for(int i=0;i<=n-1;i++){
            res+=catalanRec(i)*catalanRec(n-i-1);
        }
        return res;
    }
    public static int catalanMemoization(int n,int[] dp){
        if(n==0 || n==1){
            return dp[n]=1;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        int res=0;
        for(int i=0;i<=n-1;i++){
            res+=catalanMemoization(i,dp)*catalanMemoization(n-i-1,dp);
        }
        return dp[n]=res;
    }
    public static int catalanTabulation(int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=0;j<i;j++){
                dp[i] += dp[j]*dp[i-j-1]; 
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=4;
        //System.out.println(catalanRec(n));
        //int[] dp=new int[n+1];
        //System.out.println(catalanMemoization(n,dp));
        System.out.println(catalanTabulation(n));
    }
}