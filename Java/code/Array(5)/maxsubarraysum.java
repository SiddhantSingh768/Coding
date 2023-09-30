public class maxsubarraysum{
    public static void maxsumsubarray(int number[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i = 0;i<number.length;i++){
            int start= i;
            for(int j=i;j<number.length;j++){
                int end =j;
                currsum=0;
               // for(int k = start ; k<=end;k++){
                    //sum of sub array 
                   // currsum+=number[k];
               // }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }

            }
        }
        System.out.println("max sum = "+ maxsum);
    }
    public static void main(String[] args) {
        int number[]= {7,9,7,5,60,4,3,1};
        maxsumsubarray(number);
    }
}