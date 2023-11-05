//Dijikstra Algorithm gives shortest path from source to all vertices in a graph
//it cannot be used for negative weight (edges)
import java.util.*;
public class DijikstraAlgorithm {
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
    static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));
        graph[1].add(new Edge(1,3,5));
        graph[2].add(new Edge(2,3,1));
        graph[3].add(new Edge(3,3,0));
    }
    static class pair implements Comparable<pair>{
        int n;
        int path;
        public pair(int n,int path){
            this.n=n;
            this.path=path;
        }
        @Override
        public int compareTo(pair o){
            return this.path-o.path;//path based sorting
        }
    }
    public static void Daijikstra(ArrayList<Edge> graph[],int src){
        int dist[]=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            if(i != src){
                dist[i]=Integer.MAX_VALUE;//+ infinity
            }
        }
        boolean visited[]=new boolean[graph.length];
        PriorityQueue<pair> pq=new PriorityQueue<>();
        pq.add(new pair(src,0));
        //loop
        while(!pq.isEmpty()){
            pair rem=pq.remove();
            if(!visited[rem.n]){
                visited[rem.n]=true;
                for(int i=0;i<graph[rem.n].size();i++){
                    Edge e=graph[rem.n].get(i);
                        //neighbours
                        if(dist[rem.n]+e.dest<dist[e.dest]){
                            dist[e.dest]=dist[rem.n]+e.dest;
                            pq.add(new pair(e.dest,dist[e.dest]));
                        }
                }
            }
        }
        //print all source to vertices shortest path
            for(int i=0;i<dist.length;i++){
                System.out.println(i+"->"+dist[i]);
            }
    }
    public static void main(String[] args) {
        int V=4;
        ArrayList<Edge>[] graph=new ArrayList[V];//null
        createGraph(graph);
        int src=0;
        Daijikstra(graph,src);
    }
}
