// 0-1 Knapsack problem using tabulation
import java.util.*;
public class Tabulation {
    public static void main(String[] args) {
        int val[]={15,14,10,45,30};     //value of each item 
        int wt[]={2,5,1,3,4};           //weight of each item
        int W=7;                        //total allowes weight
        int n=val.length;
        int dp[][]=new int[val.length+1][W+1]; //dp array
        for(int i=0;i<dp.length;i++){ //col
            for(int j=0;j<dp[0].length;j++){//row
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
                else if(wt[i-1]>j){// invalid 
                    dp[i][j]=dp[i-1][j];
                }
                else{//W <= j -valid
                    dp[i][j]=Math.max(val[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);
                }
            }
        }
        System.out.println(dp[n][W]);
    }
    
}