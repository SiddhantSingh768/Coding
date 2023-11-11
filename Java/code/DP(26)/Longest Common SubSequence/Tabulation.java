//longest common subsequence using tabulation
import java.util.*;
public class Tabulation {
    public static void main(String[] args) {
        String str1="abcdge";
        String str2="abedg";//lcs="abdg;length=4"
        int m=str1.length();
        int n=str2.length();
        int[][] DP=new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                if(i==0||j==0){
                    DP[i][j]=0;
                }
            }
        }
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    DP[i][j]=1+DP[i-1][j-1];
                }
                else{
                    DP[i][j]=Math.max(DP[i-1][j],DP[i][j-1]);
                }
            }
        }
        System.out.println(DP[m][n]);
        int i=m;
        int j=n;
        String s="";
        while(i>0&&j>0){
            if(str1.charAt(i-1)==str2.charAt(j-1)){
                s+=str1.charAt(i-1);
                i--;
                j--;
            }
            else{
                if(DP[i-1][j]>DP[i][j-1]){
                    i--;
                }
                else{
                    j--;
                }
            }
        }
        System.out.println(s);
    }
}