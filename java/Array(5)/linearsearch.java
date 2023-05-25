import java.util.*;;
public class linearsearch{
    public static int  search(int numbers[] ,int key){
        for(int i =0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }        
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={4,5,8,7,9,2,3,1};
        int key=5;
        int index=search(numbers,key);
        if(index==-1){
            System.out.print("not found ");

        }else{
            System.out.print("key is at index "+index);
        }
    }
}