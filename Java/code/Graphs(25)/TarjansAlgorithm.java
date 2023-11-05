//Bridge in Graph 
import java.util.*;
public class TarjansAlgorithm {
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
        graph[0].add(new Edge(0,1,10));
        graph[1].add(new Edge(1,2,10));
        graph[2].add(new Edge(2,3,10));
        graph[0].add(new Edge(0,3,10));
        graph[3].add(new Edge(3,4,10));
        graph[4].add(new Edge(4,5,10));
        graph[5].add(new Edge(5,6,10));
        graph[4].add(new Edge(4,6,10));
        graph[2].add(new Edge(2,5,10));
    }
    public static void dfs(ArrayList<Edge> graph[],int curr,int par,int dt[],int low[],boolean vis[],int time){
        vis[curr]=true;
        dt[curr]=low[curr]=++time;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            int neigh=e.dest;
            if(neigh==par){
                continue;
            }else if(!vis[neigh]){
                dfs(graph, neigh, curr, dt, low, vis, time);
                if(dt[curr]<low[neigh]){
                    System.out.println(curr+"->"+neigh+" is a bridge");
                }
                low[curr]=Math.min(low[curr], low[neigh]);
            }else{
                low[curr]=Math.min(low[curr], dt[neigh]);
            }
        }
    }
    public static void TarjanBridge(ArrayList<Edge> graph[],int V) {
        int dt[]=new int[V];
        int low[]=new int[V];
        boolean vis[]=new boolean[V];
        int time=0;
        
        for(int i=0;i<V;i++){
            if(!vis[i]){
                dfs(graph,i,-1,dt,low,vis,time);
            }
        }
    }
    public static void main(String[] args) {
        int V=7;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);
        TarjanBridge(graph,V);
    }
}
