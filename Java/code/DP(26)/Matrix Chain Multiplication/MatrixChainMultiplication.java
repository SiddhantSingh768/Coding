import java.util.*;
public class MatrixChainMultiplication {
    public static int MCM(int arr[],int i,int j){
        if(i==j) return 0;//single matrix multiplication
        int ans=Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++){
            int temp=MCM(arr,i,k)+MCM(arr,k+1,j)+arr[i-1]*arr[k]*arr[j];
            ans=Math.min(ans,temp);
        }
        return ans;
    }
    public static int MCMmemoization(int[] arr, int i, int j, int[][] dp) {
        if(i==j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int ans=Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++){
            int temp=MCMmemoization(arr,i,k,dp)+MCMmemoization(arr,k+1,j,dp)+arr[i-1]*arr[k]*arr[j];
            ans=Math.min(ans,temp);
        }
        return dp[i][j]=ans;
    }
    public static int MCMtabulation(int arr[]) {
        int n=arr.length;
       int dp[][] = new int[n][n];
       //initialization
       for(int i=0;i<n;i++) dp[i][i]=0;

       for(int len=2;len<=n;len++){
              for(int i=1;i<=n-len;i++){
                int j=i+len-1;
                dp[i][j]=Integer.MAX_VALUE;
                for(int k=i;k<=j-1;k++){
                     int temp=dp[i][k]+dp[k+1][j]+arr[i-1]*arr[k]*arr[j];
                     dp[i][j]=Math.min(dp[i][j],temp);
                }
              }
       }
        print(dp);
         return dp[1][n-1];
    }
    public static void print(int[][] dp) {
       for (int i = 0; i < dp.length; i++) {
           for (int j = 0; j < dp[0].length; j++) {
               System.out.print(dp[i][j] + " ");
           }
           System.out.println();
       }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3};//nn=5
        int n=arr.length;
        System.out.println(MCM(arr,1,n-1));
        int dp[][]=new int[n+1][n+1];
        for(int[] row:dp) 
        Arrays.fill(row,-1);
        System.out.println(MCMmemoization(arr,1,n-1,dp));

        System.out.println(MCMtabulation(arr));
    }
}