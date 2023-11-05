import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ConnectedComponents {
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
    public static bfs(ArrayList<Edge>[] graph) {
        boolean[] visited=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!visited[i]){
                bfsutil(graph,visited);
            }
        }
    }
    public static void bfsutil(ArrayList<Edge>[] graph, boolean[] visited) {
        Queue<Integer> q=new LinkedList<>();
        
        q.add(0);
        while(!q.isEmpty()){
         int curr=q.remove();
         if(!visited[curr]){
             visited[curr]=true;
             System.out.println(curr);
             for(Edge e:graph[curr]){
                 if(!visited[e.dest]){
                     q.add(e.dest);
                 }
             }
         }
        }
    }
    public static void main(String[]args){

        int V=9;
        ArrayList<Edge>[] graph=new ArrayList[V];//null
        createGraph(graph);
        bfsutil(graph, V);
    }
}
