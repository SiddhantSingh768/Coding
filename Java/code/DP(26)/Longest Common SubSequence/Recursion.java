//A Subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters.
import java.util.*;
public class Recursion {
    public static int lcs(String str1,String str2,int m,int n){
        if(m==0||n==0){
            return 0;
        }
        if(str1.charAt(m-1)==str2.charAt(n-1)){
            return 1+lcs(str1,str2,m-1,n-1);
        }
        else{
            return Math.max(lcs(str1,str2,m-1,n),lcs(str1,str2,m,n-1));
        }
    }
    public static void main(String[] args) {
        String str1="abcdge";
        String str2="abedg";//lcs="abdg;length=4"
        int m=str1.length();
        int n=str2.length();
        System.out.println(lcs(str1,str2,m,n));
    }
}