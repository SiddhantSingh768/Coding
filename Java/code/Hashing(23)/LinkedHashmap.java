import java.util.*;
public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();
        hm.put("India", 135);
        hm.put("China", 200);
        hm.put("Pak", 30);
        System.out.println(hm);

        //TreeMap
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 135);
        tm.put("China", 200);
        tm.put("Pak", 30);
        System.out.println(tm);
    }
}
