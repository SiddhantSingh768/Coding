public class reversearray{
    public static void reverse(int number[]){
        int first=0;int last =number.length-1;
        while(first<last){
            int temp=number[last];
            number[last]=number[first];
            number[first]=temp;
            first++;
            last--;

        }
    }
    public static void main(String[] args) {
        int number[]={4,5,60,9,87,7,45};
        reverse(number);
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
        System.out.println();
    }
}