//to calculate max sum of subarray in java 
public class prefixmethod{
    public static void maxsubarraysum(int number[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[number.length];
        prefix[0]=number[0];
        // calculate prefix array 
        for(int i = 1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+number[i];
        }
        for(int i = 0;i<number.length;i++){
            int start= i;
            for(int j=i;j<number.length;j++){
                int end =j;
                currsum=start==0? prefix[end]:prefix[end]-prefix[start-1];
               
                if(maxsum<currsum){
                    maxsum=currsum;
                }

            }
        }
        System.out.println("maximum sum = " + maxsum);

    }
    public static void main(String[] args) {
        int number[] ={4,5,8,9,7,6,3,1};
        maxsubarraysum(number);
    }
}