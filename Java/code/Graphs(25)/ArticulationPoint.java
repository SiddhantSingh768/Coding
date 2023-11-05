import java.util.*;
public class ArticulationPoint {
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
        int children=0;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            int neigh=e.dest;
            if(neigh==par){
                continue;
            }else if(vis[neigh]){
                low[curr]=Math.min(low[curr], dt[neigh]);
            }else{
                dfs(graph, neigh, curr, dt, low, vis, time);
                low[curr]=Math.min(low[curr], low[neigh]);
                if(dt[curr]<=low[neigh] && par!=-1){
                    System.out.println(curr+" is an articulation point");
                }
                children++;
            }
        }
        if(par==-1 && children>1){
            System.out.println(curr+" is an articulation point");
        }
    }
    public static void articulationPoint(ArrayList<Edge> graph[]){
        int dt[]=new int[graph.length];
        int low[]=new int[graph.length];
        boolean vis[]=new boolean[graph.length];
        int time=0;
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                dfs(graph, i, -1, dt, low, vis, time);
            }
        }
    }
    
    public static void main(String[] args) {
        int V=7;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);
        articulationPoint(graph);
     
    }
}
