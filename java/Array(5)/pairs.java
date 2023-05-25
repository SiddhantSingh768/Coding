public class pairs{
    public static void printpairs(int number[]){
        int tp = 0;
        for(int i=0;i<number.length;i++){
            int curr = number[i];
            for(int j=i+1;j<number.length;j++){
                System.out.print("("+ curr +","+number[j]+")");
                tp++;
            }
            System.out.println();
        }System.out.print("total pairs = "+tp);

    }
    public static void main(String[] args) {
        int number[]={4,5,60,7,8,9,74};
        printpairs(number);
        

    }
}