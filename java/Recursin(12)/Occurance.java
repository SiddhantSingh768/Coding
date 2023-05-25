public class Occurance{
    public static int FirstOccurance(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return FirstOccurance(arr, key,i+1);
    }
    
    public static int LastOcccurance(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isfound=LastOcccurance(arr, key, i+1);
        if(isfound==-1 && arr[i]==key){
            return i;
        }
        return isfound;
    }

    public static void main(String[] args) {
        int arr[]={1,2,60,5,4,8,7,5,9};
        System.out.println(LastOccurance(arr, 5, 0));
    }
}