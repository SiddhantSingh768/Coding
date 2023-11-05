import java.util.*;
public class DirectedGraphCycleDetection {
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
    public static boolean isCycle(ArrayList<Edge>[] graph){
        boolean visited[]=new boolean[graph.length];
        boolean recStack[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!visited[i]){
                if(isCycleutil(graph,i,visited,recStack)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isCycleutil(ArrayList<Edge>[] graph,int src,boolean[] visited,boolean[] recStack){
        visited[src]=true;
        recStack[src]=true;
        for(Edge e:graph[src]){
            if(!visited[e.dest]){
                if(isCycleutil(graph,e.dest,visited,recStack)){
                    return true;
                }
            }else if(recStack[e.dest]){
                return true;
            }
        }
        recStack[src]=false;
        return false;
    }
    public static void main(String[] args) {
        int V=4;
        ArrayList<Edge>[] graph=new ArrayList[V];//null
        createGraph(graph);
        System.out.println(isCycle(graph));
    }
}
