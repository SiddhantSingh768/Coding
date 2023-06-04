public class Backtracking{
    public static void changrArr(int arr[],int i,int val){
        //Base Case 
        if(i==arr.length){
            printArr(arr);
            return;
        }
        //Recursion 
        arr[i]=val;
        changrArr(arr, i+1, val+1);
        arr[i]=arr[i]-2;//Backtracking - this code will run at end 
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        changrArr(arr, 0, 1);
        printArr(arr);
    }
}