//Array of integers is given, find the length of the longest subsequence of a given sequence such that all elements of the subsequence are sorted in increasing order.
import java.util.*;
public class LongestIncreasingSubsequence {
    public static int LCS(int arr1[],int arr2[]){
        int n=arr1.length;
        int m=arr2.length;
        int dp[][]=new int[n+1][m+1];
        //initialization
        for(int i=0;i<n+1;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<m+1;j++){
            dp[0][j]=0;
        }
        //filling the dp matrix
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(arr1[i-1]==arr2[j-1]){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[n][m];
    }
    public static int LIS(int[] arr1) {
        HashSet <Integer> set = new HashSet<>();
        for(int i=0;i<arr1.length;i++) {
            set.add(arr1[i]);
        }
        int arr2[] = new int[set.size()];//sorted array
        int i=0;
        for(int num:set) {
            arr2[i]=num;
            i++;
        }
        Arrays.sort(arr2);//ascending order
        return LCS(arr1,arr2);
    }
    public static void main(String[] args) {
        int[] arr = {50, 3, 10, 7, 40, 80};
        System.out.println("Increasing Subsequence = "+ LIS(arr));
    }
}