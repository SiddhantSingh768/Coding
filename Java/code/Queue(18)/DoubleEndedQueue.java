import java.util.*;
public class DoubleEndedQueue{
    static class Stack{
        Deque<Integer>deque=new LinkedList<>();
        public void Push(int data){
            deque.addLast(data);
        }
        public int peek(){
            return deque.getLast();
        }
        public int pop(){
            return deque.removeLast();
        }
    }
    public static void main(String[] args) {
        //Deque<Integer>q=new LinkedList<>();
        //q.addFirst(1);
        //q.addLast(6);
        //q.removeFirst(1);

        Stack s=new Stack();
        s.Push(1);
        s.Push(2);
        s.Push(3);
        System.out.println(s.peek());
    }
}