//dfs
import java.util.*;
public class TopologicalSorting{
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
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,0));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,0));
    }
    public static void topSort(ArrayList<Edge>[] graph) {
        boolean visited[]=new boolean[graph.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<graph.length;i++){
            if(!visited[i]){
                topSortUtil(graph,i,visited,st);
            }
        }
        while(!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }
    }
    public static void topSortUtil(ArrayList<Edge>[] graph,int src,boolean[] visited,Stack<Integer> st){
        visited[src]=true;
        for(Edge e:graph[src]){
            if(!visited[e.dest]){
                topSortUtil(graph,e.dest,visited,st);
            }
        }
        st.push(src);
    }
    public static void main(String[] args) {
        int V=4;
        ArrayList<Edge>[] graph=new ArrayList[V];//null
        createGraph(graph);
        topSort(graph);

    }
}
