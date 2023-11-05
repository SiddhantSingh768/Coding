//Disjoint set Union
import java.util.*;
public class DisjointSet {
    static int n =7;
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
    public static void main(String[] args) {
        init();
        union(1,3);
        System.out.println(find(3));
        union(2,4);
        union(3,6);
        union(2,4);
        union(6,4);
        System.out.println(find(6));
    }
}
