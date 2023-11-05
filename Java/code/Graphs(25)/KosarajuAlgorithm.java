//strongly connected components
import java.util.*;
public class KosarajuAlgorithm {
    static class Edge{
        int src;
        int dst;
        Edge(int src,int dst){
            this.src=src;
            this.dst=dst;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[1].add(new Edge(1,2));
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,4));
        graph[4].add(new Edge(4,5));
        graph[4].add(new Edge(4,7));
        graph[5].add(new Edge(5,6));
    }
    public static void topSort(ArrayList<Edge> graph[],int curr,boolean vis[],Stack<Integer> s){
        vis[curr]=true;
        for(Edge e:graph[curr]){
            if(vis[e.dst]==false){
                topSort(graph, e.dst, vis, s);
            }
        }
        s.push(curr);
    }
    public static void dfs(ArrayList<Edge> graph[],int curr,boolean vis[]){
        vis[curr]=true;
        System.out.print(curr);
        for(Edge e:graph[curr]){
            if(vis[e.dst]==false){
                dfs(graph, e.dst, vis);
            }
        }
    }
    public static void Kosaraju(ArrayList<Edge> graph[],int V){
        //step1
        Stack<Integer> s=new Stack<>();
        boolean vis[]=new boolean[V];
        for(int i=0;i<V;i++){
            if(!vis[i]){
                topSort(graph, i, vis, s);
            }
        }
        //step2
        ArrayList<Edge> transpose[]=new ArrayList[V];
        for(int i=0;i<V;i++){
            vis[i]=false;
            transpose[i]=new ArrayList<>();
        }
        for(int i=0;i<V;i++){
            for(Edge e:graph[i]){
                transpose[e.dst].add(new Edge(e.dst,e.src));//reverse the edges
            }
        }
        //step 3
        while(!s.isEmpty()){
            int curr=s.pop();
            if(!vis[curr]){
                System.out.print("Strongly connected component is:");
                dfs(transpose, curr, vis);//scc
                System.out.println();
            }
        }
        
    }
    public static void main(String[] args) {
        int V=8;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);
        Kosaraju(graph,V);
    }
}
