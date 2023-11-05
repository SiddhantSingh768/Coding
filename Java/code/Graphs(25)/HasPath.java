import java.util.*;
public class HasPath {
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
        graph[0].add(new Edge(0,1,5));
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,4));
        graph[3].add(new Edge(3,2,1));
        graph[3].add(new Edge(3,1,3));
        graph[4].add(new Edge(4,2,4));

    }
    public static boolean hasPath(ArrayList<Edge>[] graph,int src,int dest,boolean[] visited){
        if(src==dest){
            return true;
        }
        visited[src]=true;
        for(Edge e:graph[src]){
            if(!visited[e.dest]){
                boolean hasNbrPath=hasPath(graph,e.dest,dest,visited);
                if(hasNbrPath){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int V=9;
        ArrayList<Edge>[] graph=new ArrayList[V];//null
        createGraph(graph);
        System.out.println(hasPath(graph,0,4,new boolean[V]));
    }
}
