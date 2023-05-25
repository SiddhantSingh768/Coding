public class largest{
    public static int getlargest(int numbers[]){
        int largestnumber=Integer.MIN_VALUE;
        int smallestnumber=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largestnumber<i){
                largestnumber=numbers[i];
            }
            if(smallestnumber>numbers[i]){
                smallestnumber=numbers[i];
            }
        }
        System.out.println("smallest number is "+smallestnumber);
        return largestnumber;

    }
    public static void main(String[] args) {
        int numbers[]={4,5,60,8,9,7};
        System.out.println("largest value is "+ getlargest(numbers));

    }
}