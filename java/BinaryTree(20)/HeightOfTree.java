import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

import org.w3c.dom.Node;

public class HeightOfTree{
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
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        return Math.max(leftHeight,rightHeight)+1;
    }
    public static int count(Node root){
        if(root==null){
            return 0;
        }
        int leftCount=count(root.left);
        int rightCount=count(root.right);
        return leftCount+rightCount+1;
    }
    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        int leftSum=sum(root.left);
        int rightSum=sum(root.right);
        return leftSum+rightSum+root.data;
    }
    public static int diameter(Node root){//O(N^2)
        if(root==null){
            return 0;
        }
        int leftDiameter=diameter(root.left);
        int leftHeight=height(root.left);
        int rightDiameter=diameter(root.right);
        int rightHeight=height(root.right);
        int SelfDiameter = leftHeight+rightHeight+1;

        return Math.max(SelfDiameter,Math.max(leftHeight,rightHeight));
    }
    static class info{
        int height;
        int diameter;
        public info(int diameter, int height){
            this.height=height;
            this.diameter=diameter;
        }
    }
    public static info diam(Node root){//O(N)
        if(root==null){
            return new info(0,0);
        }
        info leftInfo=diam(root.left);
        info rightInfo=diam(root.right);
        int diameter=Math.max(leftInfo.height+rightInfo.height+1,Math.max(leftInfo.diameter,rightInfo.diameter));
        int height=Math.max(leftInfo.height,rightInfo.height)+1;
        return new info(diameter,height);
    }
    public static boolean isIdentical(Node node,Node subRoot){
        if(node==null && subRoot==null){
            return true;
        }else if(node==null || subRoot==null || node.data !=subRoot.data){
            return false;
        }
        if(!isIdentical(node.left, subRoot.left)){
            return false;
        }
        if(!isIdentical(node.right, subRoot.right)){
            return false;
        }return true;
    }
    public static boolean isSubtree(Node root,Node subRoot){
        if(root==null){
            return false;
        }
        if(root.data==subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
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

        /*             2
                      / \
                     4   5 
         */

        Node subRoot=new Node(2);
        subRoot.left=new Node(4);
        subRoot.right=new Node(5);

        System.out.println("height of tree = "+ height(root));
        System.out.println("count= "+count(root));
        System.out.println("sum= "+sum(root));
        System.out.println("diameter= "+diameter(root));
        System.out.println("diameter= "+diam(root).diameter);
        System.out.println("isSubtree= "+isSubtree(root,subRoot));
 
        
    }
}