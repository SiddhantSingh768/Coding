import java.util.*;
public class FractionalKnapsack{
    public static void main(String[] args) {
        int val[]={60,100,120};
        int weight[]={10,20,30};
        int W=50;

        double ratio[][]=new double[val.length][2];
        for(int i=0;i<val.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(double)weight[i];
        }
        //asending order
        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));
        int capacity=W;
        int finalVal=0;
        for(int i=ratio.length-1;i>=0;i--){
            if(capacity>=weight[(int)ratio[i][0]]){//include full item
                capacity-=weight[(int)ratio[i][0]];
                finalVal+=val[(int)ratio[i][0]];
            }else{
                finalVal+=capacity*ratio[i][1];//include ratio of item
                break;
            }
        }System.out.println("finalVal="+finalVal);
    }
}