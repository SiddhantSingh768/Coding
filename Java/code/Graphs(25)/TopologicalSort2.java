//Bfs
import java.util.*;
public class TopologicalSort2 {
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
    public static void calcIndeg(ArrayList<Edge>[] graph,int indegree[]){
        for(int i=0;i<graph.length;i++){
            int V=i;
            for(int j=0;j<graph[V].size();j++){
                Edge e=graph[V].get(j);
                indegree[e.dest]++;
            }
        }
    }
    public static void topSort(ArrayList<Edge>[] graph) {
        int indegree[]=new int[graph.length];
        calcIndeg(graph,indegree);
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        //bfs
        while(!q.isEmpty()){
            int rem=q.remove();
            System.out.print(rem+" ");
            for(int i=0;i<graph[rem].size();i++){
                Edge e=graph[rem].get(i);
                indegree[e.dest]--;
                if(indegree[e.dest]==0){
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int V=4;
        ArrayList<Edge>[] graph=new ArrayList[V];//null
        createGraph(graph);
        topSort(graph);
    }
}
