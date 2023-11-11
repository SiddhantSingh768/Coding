//A SubString is a contiguous sequence of characters within a string. Given two strings, s1 and s2, find the length of the longest common substring.
import java.util.*;
public class LongestCommonSubstring {
    public static int longestCommonSubstring(String s1, String s2) {
        int[][] dp = new int[s1.length()+1][s2.length()+1];
        int max = 0;
        for(int i=0;i<=s1.length();i++){
            dp[i][0] = 0;
        }
        for(int j=0;j<=s2.length();j++){
            dp[0][j] = 0;
        }
        for(int i=1;i<=s1.length();i++){
            for(int j=1;j<=s2.length();j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                    max = Math.max(max,dp[i][j]);
                }
                else{
                    dp[i][j] = 0;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String s1 = "ABCDE";
        String s2 = "ABGCE";// 2 "AB"
        System.out.println(longestCommonSubstring(s1,s2));
    }
}