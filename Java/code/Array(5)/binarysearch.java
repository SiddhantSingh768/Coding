public class binarysearch{
    public static int binary(int number[],int key){
        int start=0;int end = number.length -1;
        int mid =(start+end)/2;
        if(number[mid]==key){
            return mid;
        }
        if(number[mid]<key){//right
            start=mid +1;
        }
        else{//left
            start=mid -1;
        }
        return -1;

    }
    public static void main(String[] args) {
        int Number[]={5,60,4,2,8,7,9,3,1};
        int key=8;
        System.out.print("index for key is "+ binary(Number, key));

    }
}