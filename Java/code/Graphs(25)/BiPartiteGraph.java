import java.util.*;
public class BiPartiteGraph {
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
        // graph[4].add(new Edge(4,2));
    }
    public static boolean isBiPartite(ArrayList<Edge>[] graph){
        int col[] = new int[graph.length];
        for(int i = 0; i < graph.length; i++){
            col[i]=-1;//no color
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i = 0; i < graph.length; i++){
            if(col[i]==-1){//Bfs
                q.add(i);
                col[i]=0;//yelllow
                while(!q.isEmpty()){
                    int rem=q.remove();
                    for(Edge e:graph[rem]){
                        if(col[e.dest]==-1){
                            int nextCol=col[rem]==0 ? 1 : 0 ;
                            col[e.dest]=nextCol;
                            q.add(e.dest);
                        }else if(col[e.dest]==col[rem]){
                            return false;//Not BiPartite
                        }
                    }
                }
            }
        }return true;
    }

    public static void main(String[] args) {
        int V=5;
        ArrayList<Edge>[] graph=new ArrayList[V];//null
        createGraph(graph);
        System.out.println(isBiPartite(graph));
    }
}
