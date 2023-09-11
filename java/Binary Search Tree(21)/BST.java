import java.util.*;

public class BST{   
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }    
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            //left subtree
            root.left=insert(root.left,val);
        }else{
            //right subtree
            root.right=insert(root.right,val);
        }
        return root;
    }
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static boolean search(Node root ,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data>key){
            return search(root.left,key);
        }else{
            return search(root.right,key);
        }
    }
    public static Node Delete(Node root,int val){
        if(root==null){
            return root;
        }
        if(root.data>val){
            root.left=Delete(root.left,val);
        }else if(root.data<val){
            root.right=Delete(root.right,val);
        }else{//Voila
            if(root.left==null){//case-1:leaf node
                return root.right;
            }else if(root.right==null){//case-2:single child
                return root.left;
            }else{//case-3:both children
                Node temp=findinordersucessor(root);
                root.data=temp.data;
                root.right=Delete(root.right,temp.data);
            }
        }
        return root;
    }
    public static Node findinordersucessor(Node root){
        Node temp=root;
        while(temp.left!=null){
            temp=temp.left;
        }
        return temp;
    }
    public static void printInRange(Node root,int k1,int k2){
        if(root==null){
            return;
        }
        if(root.data >= k1 && root.data <= k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1, k2);
        }else if(root.data<k1){
            printInRange(root.left,k1,k2);
        }else{
            printInRange(root.right,k1,k2);}
    }
    public static void PrintPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("null");
    }
    public static void PrintRoot2Leaf(Node root,ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right==null){
            PrintPath(path);
        }
        PrintRoot2Leaf(root.left,path);
        PrintRoot2Leaf(root.right,path);
        path.remove(path.size()-1);
    }
    public static boolean isValidBST(Node root,Node min,Node max){
        if(root==null){
            return true;
        }
        if(min!=null && root.data<=min.data){
            return false;
        }
        if(max!=null && root.data>=max.data){
            return false;
        }
        return isValidBST(root.left,min,root) && isValidBST(root.right,root,max);
    }
    public static void main(String[] args) {
        //int values[]={5,1,3,4,2,7};
        int values[]={8,5,3,1,4,6,10,11,14}; //deleting a node

        Node root = null;
        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        inOrder(root);
        System.out.println();
        if(search(root,4)){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
        System.out.println();
        
        //root=Delete(root,5);
        //inOrder(root);
        //System.out.println();

        printInRange(root, 5, 12);

        PrintRoot2Leaf(root,new ArrayList<Integer>());

        if(isValidBST(root,null,null)){
            System.out.println("Valid BST");
        }else{
            System.out.println("Not a Valid BST");
        }
    }
}