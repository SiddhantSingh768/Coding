//any item can be added any number of times
import java.util.*;
public class UnboundedKnapsack {//O(n*W)
    public static int unboundedKnapsack(int wt[],int val[],int W){
        int n=wt.length;
        int dp[][]=new int[n+1][W+1];
        //i=item & j= Target sum
        for(int i=0;i<n+1;i++){
            dp[i][0]=0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                int v=wt[i-1];
                //include
                if(v <= j){
                    dp[i][j]=Math.max(val[i-1]+dp[i][j-v],dp[i-1][j]);
                }
                //exclude
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        print(dp);
        return dp[n][W];
    }
    public static void print(int dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int wt[]={1,3,4,5};
        int val[]={10,40,50,70};
        int W=8;
        System.out.println(unboundedKnapsack(wt,val,W));
    }
}