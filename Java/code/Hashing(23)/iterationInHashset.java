import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;
public class iterationInHashset {
    public static void main(String[] args) {
        HashSet<String> cities=new HashSet<>();
        cities.add("Delhi");
        cities.add("London");
        cities.add("Paris");
        cities.add("New York");

        // Iterator it=cities.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        for(String s:cities){
            System.out.println(s);
        }
    }
}
