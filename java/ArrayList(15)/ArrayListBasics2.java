import java.util.ArrayList;
import java.util.Collections;

public class ArrayListBasics2{
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(7);
        list.add(9);
        list.add(8);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());    //Descending 
        System.out.println(list);

    }
}