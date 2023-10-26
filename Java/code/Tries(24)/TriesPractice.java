import java.util.*;
public class TriesPractice{
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
    public static void main(String[] args) {
        String words[]={"the", "a", "there", "answer", "any", "by", "bye", "their","abc"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        System.out.println(search("the"));//O(L)
    }
} 