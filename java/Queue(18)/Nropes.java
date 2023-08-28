//Given are N ropes of different lengths, the task is to connect these ropes into one rope with minimum cost, such that the cost to connect two ropes is equal to the sum of their lengths
import java.util.*;
public class Nropes{
    static int minCost(int arr[], int n){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (int i = 0; i < n; i++){
            //adding length of ropes in queue
            pq.add(arr[i]);
        }
        int ans = 0;
        while (pq.size() > 1){
            int first = pq.poll();
            int second = pq.poll();
            ans += first + second;
            pq.add(first + second);
        }
        return ans;
    }

    public static void main(String[] args) {
        int len[] = { 4, 3, 2, 6 };
        int size = len.length;
        System.out.println("Total cost for connecting"+ " ropes is "+ minCost(len, size));

    }
}