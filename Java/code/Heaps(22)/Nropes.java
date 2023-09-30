import java.util.PriorityQueue;
public class Nropes{
    public static void main(String[] args) {
        int ropes[]={2,3,3,4,6};
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<ropes.length;i++){
            pq.add(ropes[i]);
        }
        int cost=0;
        while(pq.size()>1){
            int min=pq.remove();
            int sec_min=pq.remove();
            cost+=min+sec_min;
            pq.add(min+sec_min);
        }
        System.out.println("cost of connecting N ropes : "+cost);
    }
}