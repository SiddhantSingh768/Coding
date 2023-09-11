import java.util.*;
public class TopView{
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }    
    static class info{
        Node node;
        int hd;//horizontal distance
        public info(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    public static void topView(Node root){
        Queue<info> q=new LinkedList<>();
        HashMap<Integer,Node> map=new HashMap<>();
        int min=0,max=0;
        q.add(new info(root,0));
        q.add(null);
        while(!q.isEmpty()){
            info curr=q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if(!map.containsKey(curr.hd)){//first time hd is occuring
                    map.put(curr.hd,curr.node);
                }
                if(curr.node.left!=null){
                    q.add(new info(curr.node.left,curr.hd-1));
                    min=Math.min(min,curr.hd-1);
                }
                if(curr.node.right!=null){
                    q.add(new info(curr.node.right,curr.hd+1));
                    max=Math.max(max,curr.hd+1);
                }
            }
        }    
        for(int i=min;i<=max;i++){
            System.out.print(map.get(i).data+" ");
        }System.out.println();
    }
    public static void Klevel(Node root,int level,int k){
        if(root==null){
            return;
        }
        if(level==k){
            System.out.print(root.data+" ");
            return;
        }
        Klevel(root.left,level+1,k);
        Klevel(root.right,level+1,k);
    }
    public static Node lca(Node root,int n1,int n2){//lowest common ancestors 
        if(root==null||root.data==n1 || root.data==n2){
            return root;
        }
        Node leftLCA=lca(root.left,n1,n2);
        Node rightLCA=lca(root.right,n1,n2);
        //leftLCA=value and rightLCA=null
        if(leftLCA==null){
            return rightLCA;
        }
        if(rightLCA==null){
            return leftLCA;
        }
        return root;
    }
    public static int lcaDistance(Node root,int n){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftDistance=lcaDistance(root.left,n);
        int rightDistance=lcaDistance(root.right,n);
        if(leftDistance==-1 && rightDistance==-1){
            return -1;
        }
        else if(leftDistance!=-1){
            return leftDistance+1;
        }
        else{
            return rightDistance+1;
        }
    }
    public static int minDistance(Node root,int n1,int n2){
        Node Lca=lca(root,n1,n2);
        int d1=lcaDistance(Lca,n1);
        int d2=lcaDistance(Lca,n2);
        return d1+d2;
    }
    public static int KthAncestor(Node root,int n,int k){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftDistance=KthAncestor(root.left,n,k);
        int rightDistance=KthAncestor(root.right,n,k);
        if(leftDistance==-1 && rightDistance==-1){
            return -1;
        }int max=Math.max(leftDistance,rightDistance);
        if(max+1==k){
            System.out.println(root.data);
        }
        return max+1;
    }
    public static int transform(Node root){
        if(root==null){
            return 0;
        }
        int leftChild=transform(root.left);
        int rightChild=transform(root.right);
        int data=root.data;
        int newLeft=root.left==null?0:root.left.data;
        int newRight=root.right==null?0:root.right.data;
        root.data=newLeft+leftChild+newRight+rightChild;
        return data;
    }
    public static  int preOrder(Node root){
        if(root==null){
            return 0;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
        return 0;
    }
    public static void main(String[] args) {
        /*      
                           1
                          / \
                        2    3
                       / \   /  \  
                      4   5  7   6
        */
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        //topView(root);
        //int k=3;
        //Klevel(root, 1, k);
        System.out.println();

        int n1=4, n2=7;
        System.out.println("lowest common ancestor= "+lca(root, n1, n2).data);
        System.out.println("minimum distance between "+n1+" and "+n2+" is "+minDistance(root, n1, n2));

        int n=5,k=2;
        System.out.print(k+"th ancestor of "+n+" is : ");
        KthAncestor(root, n, k);
        /*                        27
                               /    \
                             9       13           Transform to sumTree
                            / \     / \
                           0   0   0   0
        */
        transform(root);           
        preOrder(root);
    }
}