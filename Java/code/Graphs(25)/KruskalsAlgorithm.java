import java.util.*;
public class KruskalsAlgorithm {
    static class Edge implements Comparable<Edge>{
        int src;
        int dst;
        int wt;
        Edge(int src,int dst,int wt){
            this.src=src;
            this.dst=dst;
            this.wt=wt;
        }
        @Override
        public int compareTo(Edge o) {
            return this.wt-o.wt;
        }
    }
    static void createGraph(ArrayList<Edge> edges){
        edges.add(new Edge(0,1,10));
        edges.add(new Edge(0,2,6));
        edges.add(new Edge(0,3,5));
        edges.add(new Edge(1,3,15));
        edges.add(new Edge(2,3,4));
    }
    static int n =7;//vertices
    static int par[]=new int[n];
    static int rank[]=new int[n];

    public static void init(){
        for(int i=0;i<n;i++){
            par[i]=i;
        }
    }
    public static int find(int x){
        if(par[x]==x){
            return x;
        }
        else{
            return par[x]=find(par[x]);
        }
    }
    public static void union(int a ,int b){
        int parA=find(a);
        int parB=find(b);

        if(rank[parA]==rank[parB]){
            par[parA]=parB;
            rank[parB]++;
        }
        else if(rank[parA]>rank[parB]){
            par[parB]=parA;
        }
        else{
            par[parA]=parB;
        }
    }
    public static void KruskalsMST(ArrayList<Edge> edges,int V){
        init();
        Collections.sort(edges);
        int mstCost=0;
        int count=0;
        for(int i=0;count<V-1;i++){
            Edge e=edges.get(i);
            //src,dst,wt
            int parA=find(e.src);
            int parB=find(e.dst);
            if(parA!=parB){
                union(e.src, e.dst);
                mstCost+=e.wt;
                count++;
            }
        }
        System.out.println(mstCost);
    }
    public static void main(String[] args) {
        int V=4;
        ArrayList<Edge> edges=new ArrayList<>();
        createGraph(edges);
        KruskalsMST(edges,V);
    }
    
}