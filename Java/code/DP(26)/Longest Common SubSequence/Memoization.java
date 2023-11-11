//longest common subsequence using memoization
import java.util.*;
public class Memoization {
    public static int lcs(String str1,String str2,int m,int n,int[][] DP){
        if(m==0||n==0){
            return 0;
        }
        if(DP[m][n]!=-1){
            return DP[m][n];
        }
        if(str1.charAt(m-1)==str2.charAt(n-1)){
            return DP[m][n]=1+lcs(str1,str2,m-1,n-1,DP);
        }
        else{
            return DP[m][n]=Math.max(lcs(str1,str2,m-1,n,DP),lcs(str1,str2,m,n-1,DP));
        }
    }
    public static void main(String[] args) {
        String str1="abcdge";
        String str2="abedg";//lcs="abdg;length=4"
        int m=str1.length();
        int n=str2.length();
        int[][] DP=new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                DP[i][j]=-1;
            }
        }
        System.out.println(lcs(str1,str2,m,n,DP));
    }
}