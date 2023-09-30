import java.util.*;
//maximum in sliding window in a subarray of size k
public class SlidingWindowMaximum {
    static class Pair implements Comparable<Pair>{
        int index;
        int value;
        public Pair(int index,int value){
            this.index=index;
            this.value=value;
        }
        @Override
        public int compareTo(Pair o){
            return o.value-this.value;
        }
    }   
    public static void main(String[] args) {
        int arr[]={1,3,-1,-3,5,3,6,7};
        int k=3;//window size
        int res[]=new int[arr.length-k+1];//result array
        PriorityQueue<Pair> pq=new PriorityQueue<>();

        //1st window
        for(int i=0;i<k;i++){
            pq.add(new Pair(i,arr[i]));
        }
        res[0]=pq.peek().value;
        for(int i=k;i<arr.length;i++){
            while(pq.size()>0 && pq.peek().index<=i-k){
                pq.remove();
            }
            pq.add(new Pair(i,arr[i]));
            res[i-k+1]=pq.peek().value;
        }
        //print result
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
