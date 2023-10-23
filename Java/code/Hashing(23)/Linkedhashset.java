import java.util.LinkedHashSet;
public class Linkedhashset {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);
        System.out.println(set);
        //linked hashset maintains the order of insertion
        
        if(set.contains(20)){
            System.out.println("20 is present");
        }
    }
}
