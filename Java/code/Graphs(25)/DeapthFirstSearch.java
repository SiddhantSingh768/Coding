import java.util.*;
public class DeapthFirstSearch {
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
    public static void dfs(ArrayList<Edge>[] graph,int src,boolean[] visited){
        if(!visited[src]){
            visited[src]=true;
            System.out.println(src);
            for(Edge e:graph[src]){
                if(!visited[e.dest]){
                    dfs(graph,e.dest,visited);
                }
            }
        }
    }
    public static void main(String[] args) {
        int V=9;
        ArrayList<Edge>[] graph=new ArrayList[V];//null
        createGraph(graph);
        dfs(graph,0,new boolean[V]);
    }
}
