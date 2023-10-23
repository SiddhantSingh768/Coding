import java.util.*;
public class ItineraryFromTickets {
    public static String getStart(HashMap<String,String> tickets){
        HashMap<String,String> revMap=new HashMap<>();
        for(String key:tickets.keySet()){
            revMap.put(tickets.get(key),key);
        }
        for(String key:tickets.keySet()){
            if(!revMap.containsKey(key)){
                return key;//this is the starting point
            }
        }
        return null;
    }
    public static void main(String[] args) {
       HashMap<String,String> tickets=new HashMap<>();
        tickets.put("Moscow","Paris");
        tickets.put("Delhi","Moscow");
        tickets.put("London","New York");
        tickets.put("New York","Delhi");
        String start=getStart(tickets);
        System.out.println(start);
        for(String key:tickets.keySet()){
            System.out.println(key+"->"+tickets.get(start));
            start=tickets.get(start);
        }
    }
}
