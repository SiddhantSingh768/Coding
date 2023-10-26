import java.util.*;
public class UniquePrefix {
    static class Node{
        Node children[] = new Node[26];
        boolean eows = false;//end of children words
        int freq;
        public Node(){
            for(int i=0;i<children.length;i++){
                children[i]=null;
            }
            freq=1;
        }
    }
    public static Node root=new Node();
    public static void insert(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int index=word.charAt(i)-'a';
            if(curr.children[index]==null){
                curr.children[index]=new Node();
            }else{
                curr.children[index].freq++;
            }
            curr=curr.children[index];
        }
        curr.eows=true;
    }
    public static void  findPrefix(Node root,String ans,int index){
        if(root==null){
            return;
        }
        if(root.freq==1){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<root.children.length;i++){
            if(root.children[i]!=null){
                findPrefix(root.children[i],ans+(char)(i+'a'),i);
            }
        }
    }
    public static void main(String[] args) {
        String arr[]={"zebra", "dog", "duck", "dove"};
        for (int i=0; i<arr.length; i++) {
            insert(arr[i]);
        }
        root.freq=-1;
        findPrefix(root, " ", 0);
    }
}
