import java.util.*;
public class PrimsAlgorithm {
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
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));
        graph[1].add(new Edge(1,3,5));
        graph[2].add(new Edge(2,3,1));
        graph[3].add(new Edge(3,3,0));
    }
    static class Pair implements Comparable<Pair>{
        int v;
        int cost;
        public Pair(int v,int cost){
            this.v=v;
            this.cost=cost;
        }
        @Override
        public int compareTo(Pair o){
            return this.cost-o.cost;//ascending
        }
    }
    public static void prims(ArrayList<Edge> graph[]){
        boolean visited[]=new boolean[graph.length];
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        pq.add(new Pair(0,0));
        int finalCost=0;//total cost
        while (!pq.isEmpty()) {
            Pair rem=   pq.remove();
            if(!visited[rem.v]){
                visited[rem.v]=true;
                finalCost+=rem.cost;
                for(Edge e:graph[rem.v]){
                    if(!visited[e.dest]){
                        pq.add(new Pair(e.dest,e.wt));
                    }
                }
            }
            System.out.println("Final Cost: "+finalCost);
        }
    }
    public static void main(String[] args) {
        int V=4;
        ArrayList<Edge>[] graph=new ArrayList[V];//null
        createGraph(graph);
        prims(graph);
    }
}
