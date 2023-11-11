import java.util.*;
public class Tabulation {
    
    public static void main(String[] args) {
        int n = 5;
        int ways[]= new int[n+1];//0 to n
        ways[0] = 1;
        for(int i = 1; i <= n; i++) {
           if(i==1){
                ways[i] = ways[i-1];
           }else{
                ways[i] = ways[i-1] + ways[i-2];
           }
        }
        System.out.println("The number of ways to climb " + n + " stairs is: " + ways[n]);
    }
    
}