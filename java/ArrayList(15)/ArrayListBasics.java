import java.util.ArrayList;

public class ArrayListBasics {
    public static void swap(ArrayList<Integer>list,int idx2,int idx1){
        int temp=list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String[] args) {
        //Java Collection Framework
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(9);
        list.add(8);
        list.add(7);
        System.out.println(list);
        //To get an element from ArrayList
        int element =list.get(1);
        System.out.println(element);
        //To remove an element from ArrayList 
        // list.remove(1);
        //set
        //list.set(0,5);
         //list.add(0, 9);
         //size of ArrayList
        System.out.println(list.size());
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            max=Math.max(max, list.get(i));
        }
        System.out.println("max element = "+ max);
        int idx1=1,idx2=3;

        swap(list, idx2, idx1);
        System.out.println(list);

    }
}
