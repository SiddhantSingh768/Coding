import java.util.*;
public class GraphsBasics {
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
    public static void bfs(ArrayList<Edge>[] graph){
        Queue<Integer> q=new LinkedList<>();
        boolean[] visited=new boolean[graph.length];
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
       /*         0---------1
                    (1)  / \  (3)
                        /    \
                        2-------3
                        |   (1)
                        | (2)
                        4
                        */
        int V=9;
        ArrayList<Edge>[] graph=new ArrayList[V];//null
        createGraph(graph);
        // for(int i=0;i<V;i++){
        //     graph[i]=new ArrayList<>();
        // }
        // //0-vertex
        // graph[0].add(new Edge(0,1,5));
        // //1-vertex
        // graph[1].add(new Edge(1,0,5));
        // graph[1].add(new Edge(1,2,1));
        // graph[1].add(new Edge(1,3,3));
        // //2-vertex
        // graph[2].add(new Edge(2,1,1));
        // graph[2].add(new Edge(2,3,1));
        // graph[2].add(new Edge(2,4,4));
        // //3-vertex
        // graph[3].add(new Edge(3,1,3));
        // graph[3].add(new Edge(3,2,1));
        // //4-vertex
        // graph[4].add(new Edge(4,2,2));
        // //2's neighbours
        // for(int i=0;i<graph[2].size();i++){
        //     Edge e=graph[2].get(i);//src,dest,wt
        //     System.out.println(e.src+"->"+e.dest+"->"+e.wt);
        // }
        bfs(graph);
    }
}
