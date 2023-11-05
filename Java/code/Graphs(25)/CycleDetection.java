//unidirectional graph  

import java.util.ArrayList;

public class CycleDetection {
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
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));
        graph[2].add(new Edge(2,4));
        graph[3].add(new Edge(3,2));
        graph[3].add(new Edge(3,1));
        graph[4].add(new Edge(4,2));
    }
    public static boolean isCycle(ArrayList<Edge>[] graph,int src,boolean[] visited){
        if(visited[src]){
            return true;
        }
        visited[src]=true;
        for(Edge e:graph[src]){
            if(!visited[e.dest]){
                boolean hasNbrCycle=isCycle(graph,e.dest,visited);
                if(hasNbrCycle){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int V=5;
        ArrayList<Edge>[] graph=new ArrayList[V];//null
        createGraph(graph);
        System.out.println(isCycle(graph,0,new boolean[V]));
        
    }
}
