import java.util.*;
public class MinimumArrayJump {
    public static int minJumps(int nums[]){
        int n=nums.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        dp[n-1]=0;
        for(int i=n-2;i>=0;i--){
            int steps=nums[i];
            int min=Integer.MAX_VALUE;
            for(int j=i+1;j<=i+steps && j<n;j++){
                if( dp[j]!=-1){
                    min=Math.min(min,dp[j]+1);
                }
            }
            if(min!=Integer.MAX_VALUE){
                dp[i]=min;
            }
        }  
        //dp[0] will have the answer
        //dp[0]=0->n-1
        return dp[0];
    }
    public static void main(String[] args) {
        int nums[]={2,3,1,1,4};
        System.out.println(minJumps(nums));
    }
}