import java.util.*;
public class SegmentTrees {
    static int tree[];
    public static void init(int n){
        tree=new int[4*n];
    }
    public static int buildST(int arr[], int start, int end, int index){
        if(start==end){
            tree[index]=arr[start];
            return tree[index];
        }
        int mid=(start+end)/2;
        tree[index]=buildST(arr, start, mid, 2*index+1)+buildST(arr, mid+1, end, 2*index+2);
        return tree[index];
    }
    public static int getSumUtil( int start, int end, int qi, int qj, int index){
        if(qi<=start && qj>=end){//complete overlap
            return tree[index];
        }//q=query
        if(end<qi || start>qj){//non overlapping
            return 0;
        }
        //partial overlap
        int mid=(start+end)/2;
        return getSumUtil( start, mid, qi, qj, 2*index+1)+getSumUtil( mid+1, end, qi, qj, 2*index+2);
    }
    public static int getSum(int arr[],int qi,int qj){
        return getSumUtil( 0, arr.length-1, qi, qj, 0);
    }
    public static void update(int arr[],int idx,int val){
        int diff=val-arr[idx];
        arr[idx]=val;
        updateUtil(0, arr.length-1, idx, diff, 0);
    }
    public static void updateUtil(int start,int end,int idx,int diff,int index){
        if(idx<start || idx>end){
            return;
        }
        tree[index]+=diff;
        if(start!=end){
            int mid=(start+end)/2;
            updateUtil(start, mid, idx, diff, 2*index+1);//left
            updateUtil(mid+1, end, idx, diff, 2*index+2);//right
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int n=arr.length;
        init(n);
        buildST(arr, 0, n-1, 0);
        for (int i=0; i<tree.length; i++) {
            System.out.print(tree[i]+" ");
        }
        System.out.println();
        System.out.println("sum = "+getSum(arr, 2, 5));
        update(arr, 2, 2);
        System.out.println("sum = "+getSum(arr, 2, 5));
    }
}