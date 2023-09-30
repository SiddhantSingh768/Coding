import java.util.Arrays;

public class insertionsort{
    public static void insertion(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            // finding out the current position to insert 
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
        }
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,5,4,6,1,3};
        //insertion(arr);
        Arrays.sort(arr);    //inbuilt sorting 
        printarr(arr);
    }
}