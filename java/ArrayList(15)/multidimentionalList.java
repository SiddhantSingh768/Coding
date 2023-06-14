import java.util.ArrayList;

public class multidimentionalList{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>mainlist=new ArrayList<>();
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        ArrayList<Integer>list3=new ArrayList<>();

        for(int i=1;i<5;i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        mainlist.add( list3);
        mainlist.add(list1);
        mainlist.add(list2);
        System.out.println(mainlist);
    }

}