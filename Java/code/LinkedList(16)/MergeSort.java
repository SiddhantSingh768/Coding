import java.util.LinkedList;

import javax.xml.crypto.Data;

import linkLIst.Node;

public class MergeSort{
    public Node getMid(Node head){
        Node slow =head;
        Node fast =head.next;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;//mid node 
    }
    public Node merge(Node head1,Node head2){
        Node mergedLL=new Node(-1);
        Node temp= mergedLL;
        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1 != null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2 != null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergedLL.next;
    }
    public Node merged(Node head){
        if(head==null || head.next != null){
            return head;
        }
        //find mid 
        Node mid =getMid(head);
        //left and right MS
        Node rightHead=mid.next;
        mid.next=null;
        Node newLeft=merged(head);
        Node newRight=merged(rightHead);
        //merge 
        return merge(newLeft,newRight);
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        ll.print();
        ll.head=ll.merged(ll.head);
        ll.print();
    }
}