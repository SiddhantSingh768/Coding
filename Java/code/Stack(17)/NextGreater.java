import java.util.Stack;

public class NextGreater{
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        Stack<Integer> s=new Stack<>();
        int NxtGreater[]=new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            //1 while
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            //2 if-else
            if(s.isEmpty()){
                NxtGreater[i]=-1;
            }else{
                NxtGreater[i]=arr[s.peek()];
            }
            //3 push in s
            s.push(i);
        }
        for(int i=0;i<NxtGreater.length;i++){
            System.out.print(NxtGreater[i]+" ");
        }
        System.out.println();
    }
}