import java.util.*; 
public class WordBreak {
    static class Node{
        Node children[] = new Node[26];
        boolean eows = false;//end of children words
        public Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }
    public static Node root=new Node();

    public static void insert(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int index=word.charAt(i)-'a';
            if(curr.children[index]==null){
                curr.children[index]=new Node();
            }
            curr=curr.children[index];
        }
        curr.eows=true;
    }
    public static boolean search(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int index=word.charAt(i)-'a';
            if(curr.children[index]==null){
                return false;
            }
            curr=curr.children[index];
        }
        return curr.eows;
    }
    public static boolean BreakingWord(String key){
        if(key.length()==0) {
            return true;
        }
        for(int i=1; i<=key.length(); i++) {
            if(search(key.substring(0,i)) && BreakingWord(key.substring(i,key.length()))) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String arr[]={"i","like","sam","samsung","mobile"};
        for(int i=0; i<arr.length; i++) {
            insert(arr[i]);
        }
        String key="ilikesamsung";
        System.out.println(BreakingWord(key));//O(L)
    }
}
