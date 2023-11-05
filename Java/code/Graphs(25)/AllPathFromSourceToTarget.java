//Directed graph
import java.util.*;
public class AllPathFromSourceToTarget {
    static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        } 
    }
    static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,3));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,3));
    }
    public static void allPath(ArrayList<Edge>[] graph,int src,int dest,boolean[] visited,String Path){
        if(src==dest){
            System.out.println(Path+dest);
            return;
        }
        visited[src]=true;
        for(Edge e:graph[src]){
            if(!visited[e.dest]){
                allPath(graph,e.dest,dest,visited,Path+e.dest);
            }
        }
        visited[src]=false;
    }

    public static void main(String[] args) {
        int V=4;
        ArrayList<Edge>[] graph=new ArrayList[V];//null
        createGraph(graph);
        boolean visited[]=new boolean[V];
        allPath(graph,0,3,visited,"0");

    }
}
