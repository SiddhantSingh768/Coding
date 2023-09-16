public class SizeOfLargestBST{
    static class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            left = right = null;
        }
    }
    static class info{
        int size;
        int max;
        int min;
        boolean isBST;
        public info(boolean isBST, int size, int max, int min){
            this.isBST = isBST;
            this.size = size;
            this.max = max;
            this.min = min;
        }
    }
    public static int maxBST=0;
    public static info  largestBST(Node root){
        if(root==null){
            return new info(true,0,Integer.MIN_VALUE,Integer.MAX_VALUE);
        }
        info leftinfo=largestBST(root.left);
        info rightinfo=largestBST(root.right);
        int size=leftinfo.size+rightinfo.size+1;
        int min=Math.min(root.data,Math.min(leftinfo.min,rightinfo.min));
        int max=Math.max(root.data,Math.max(leftinfo.max,rightinfo.max));

        if(root.data<=leftinfo.max || root.data>=rightinfo.min){
            return new info(false,size,max,min);
        }
        if(leftinfo.isBST && rightinfo.isBST){
            maxBST=Math.max(maxBST,size);
            return new info(true,size,max,min);
        }
        return new info(false,size,max,min);

    }
    public static void main(String[] args) {
        Node root=new Node(50);
        root.left=new Node(30);
        root.left.left=new Node(5);
        root.left.right=new Node(20);
        root.right=new Node(60);
        root.right.left=new Node(45);
        root.right.right=new Node(70);
        root.right.right.left=new Node(65);
        root.right.right.right=new Node(80);

        info ans=largestBST(root);
        System.out.println(maxBST);
    }
}