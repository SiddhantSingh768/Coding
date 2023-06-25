import java.util.LinkedList;

import org.w3c.dom.Node;
public class LinkedList2{
  
    public static void main(String[] args) {
        //create

        LinkedList<Integer>ll=new LinkedList<>();
        //add

        ll.addFirst(5);
        ll.addLast(8);
        System.out.println(ll);
        //remove

        ll.removeFirst();
        ll.removeLast();
    }
}