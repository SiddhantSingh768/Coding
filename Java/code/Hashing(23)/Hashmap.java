import java.util.*;
public class Hashmap{
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 135);
        hm.put("China", 200);
        hm.put("Pak", 30);

        System.out.println(hm);
        System.out.println(hm.get("India"));
        hm.remove("Pak");
        System.out.println(hm.size());
        //iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);
        for(String k : keys){
            System.out.println(k + " " + hm.get(k));
        }
    }
}