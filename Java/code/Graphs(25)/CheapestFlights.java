//Cheapest Flights Within K Stops
import java.util.*;
public class CheapestFlights {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        } 
    }
    static void createGraph(int flights[][],ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<flights.length;i++){
            int src=flights[i][0];
            int dest=flights[i][1];
            int wt=flights[i][2];

            Edge e=new Edge(src,dest,wt);
            graph[src].add(e);
        }
    }
    static class info{
        int v;
        int cost;
        int stops;
        public info(int v,int c,int s){
            this.v=v;
            this.cost=c;
            this.stops=s;
        }
    }
    public static int CheapFlight(int n,int flights[][],int src,int dest,int k){
        ArrayList<Edge>graph[]=new ArrayList[n];
        createGraph(flights,graph);
        int dist[]=new int[n];
        for(int i=0;i<n;i++){
            if(i != src){
                dist[i]=Integer.MAX_VALUE;//+ infinity
            }
        }
        Queue<info> q=new LinkedList<>();
        q.add(new info(src,0,0));
        while (!q.isEmpty()) {
            info rem=q.remove();
            if(rem.stops>k){
                break;
            }
            for(int i=0;i<graph[rem.v].size();i++){
                Edge e=graph[rem.v].get(i);
                if(rem.cost+e.wt<dist[e.dest] && rem.stops<=k){
                    dist[e.dest]=rem.cost+e.wt;
                    q.add(new info(e.dest,dist[e.dest],rem.stops+1));
                }
            }
        }
        if(dist[dest]==Integer.MAX_VALUE){
            return -1;
        }else{
            return dist[dest];
        }
    }
    public static void main(String[] args) {
        int n=4;
        int flights[][]={{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int src=0,dest=3,k=1;
        ArrayList<Edge>[] graph=new ArrayList[n];
        createGraph(flights,graph);
        System.out.println(CheapFlight(n,flights,src,dest,k));
    }
}
