//We have two variables L and R, indicating a range of integers from L to R inclusive, and a
//number K, the task is to find Kth largest odd number. If K > number of odd numbers in the range
//L to R then return 0
import java.util.*;
public class KthLargestOddElement{
    public static int kthOdd(int[] range, int k){
        if(k<=0){
            return 0;
        }
        int L = range[0];
        int R = range[1];
        if ((R & 1) > 0){
            int Count = (int) Math.ceil((R - L + 1) / 2);
            if(k>Count){
                return 0;
            }
            else{
                return R - 2 * (k - 1);
            }
        }
        else{
            int Count=(R - L + 1) / 2;
            if(k>Count){
                return 0;
            }else{
                return R - 2 * (k + 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] p = { -3, 3};
        int k = 1;
        System.out.println(kthOdd(p, k));

    }
}