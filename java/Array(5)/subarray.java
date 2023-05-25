public class subarray{
    public static void printsubarray(int number[]){
        for(int i =0;i<number.length;i++){
            int start= i;
            for(int j= i;j<number.length;j++){
                int end = j;
                for(int k =start;k<=end;k++){
                    System.out.print( number[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int number[]={5,60,4,87,987,75,560,45,35};
        printsubarray(number);
    }
}