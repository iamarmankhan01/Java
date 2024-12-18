
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapSyncExample {
    public static void main(String[] args) {
        Map map = Collections.synchronizedMap(new HashMap<Integer,String>());
        map.put(2, "Anil");
        map.put(44, "Ajit");
        map.put(4, "Sayam");
        map.put(88, "Azzzz");

        Set set = map.entrySet();
        synchronized(map){
            Iterator i = set.iterator();
            //Display elements
            while (i.hasNext()) {
                Map.Entry me=(Map.Entry)i.next();
                System.out.println(me.getKey() + ": ");
                System.out.println(me.getValue());
                
            }
        }


    }
}
