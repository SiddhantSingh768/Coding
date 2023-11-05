//Bellman Ford Algorithm gives shortest path from source to all vertices in a graph
//it can be used for negative weight (edges)
import java.util.*;
public class BellmanFord {
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
    public static void BellmanFord(ArrayList<Edge> graph[],int src){
        int dist[]=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            if(i != src){
                dist[i]=Integer.MAX_VALUE;//+ infinity
            }
        }
        //loop
        for(int i=0;i<graph.length-1;i++){
            //edges
            for(int j=0;j<graph.length;j++){
                for(int k=0;k<graph[j].size();k++){
                    Edge e=graph[j].get(k);
                    if(dist[j]+e.wt<dist[e.dest]){
                        dist[e.dest]=dist[j]+e.wt;
                    }
                }
            }
        }
        //negative cycle
        for(int j=0;j<graph.length;j++){
            for(int k=0;k<graph[j].size();k++){
                Edge e=graph[j].get(k);
                if(dist[j]+e.wt<dist[e.dest]){
                    System.out.println("Negative Cycle");
                    return;
                }
            }
        }
        //print
        for(int i=0;i<dist.length;i++){
            System.out.println(i+"->"+dist[i]);
        }
    }
    public static void main(String[] args) {
        int V=4;
        ArrayList<Edge>[] graph=new ArrayList[V];//null
        createGraph(graph);
        BellmanFord(graph,0);
    }
}
