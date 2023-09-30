import java.util.*;

public class BinaryTreeB{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }    
        static class BinaryTree{
            static int idx=-1;
            public static Node buildTree(int nodes[]){
                idx++;
                if(nodes[idx]==-1){
                    return null;
                }
                Node newNode=new Node(nodes[idx]);
                newNode.left=buildTree(nodes);
                newNode.right=buildTree(nodes);
                return newNode;
            }
        public static void Preorder(Node root){// 1st main root is printed then left and right subtrees are printed
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            Preorder(root.left);
            Preorder(root.right);
        }
        public static void Inorder(Node root){// 1st left subtree is printed then root and then right subtree is printed
            if(root==null){
                return;
            }
            Inorder(root.left);
            System.out.print(root.data+" ");
            Inorder(root.right);
        }
        public static void Postorder(Node root){// 1st left subtree is printed then right subtree is printed then root is printed
            if(root==null){
                return;
            }
            Postorder(root.left);
            Postorder(root.right);
            System.out.print(root.data+" ");
        }
        public static void LevelOrder(Node root){
            if(root==null){
                return;
            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node currNode=q.remove();
                if(currNode==null){
                    System.out.println();
                    if(!q.isEmpty()){
                        q.add(null);
                    }
                }
                else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
            }    
        }
    }    

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        //System.out.println(root.data);

        System.out.println("PreOrder Traversal: ");
        //Preorder traversal
        tree.Preorder(root);
        System.out.println("   ");
        System.out.println("InOrderTraversal: ");

        //Inorder traversal
        tree.Inorder(root);
        System.out.println("   ");
        System.out.println("PostOrderTraversal:");

        //Postorder traversal
        tree.Postorder(root);
        System.out.println();
        System.out.println("LevelOrderTraversal:");

        //Level order traversal
        tree.LevelOrder(root);
        System.out.println();

 
    }
}