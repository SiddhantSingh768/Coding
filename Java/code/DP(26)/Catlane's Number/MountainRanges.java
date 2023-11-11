//Form mountain and valley ranges from a string of up and down strokes ,at any moment the number of down strokes cannot be more than number of up strokes.
import java.util.*;
//     /\/\/\/\/\/\         //
public class MountainRanges {
    public static int mountains(int n){
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<n+1;i++){
            for(int j=0;j<i;j++){
                dp[i]+=dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
         int n=4;
        System.out.println(mountains(n));
    }
}