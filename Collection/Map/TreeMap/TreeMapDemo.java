
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {
        TreeMap<String, String> hm = new TreeMap<String, String>();
        System.out.println(hm.size());
        hm.put("10004", "dddd");
        hm.put("10003", "cccc");
        hm.put("10002", "bbbb");
        hm.put("10001", "aaaa");
        show(hm);
        SortedMap sm = hm.headMap("10003");
        System.out.println("less than 10003");
        show(sm);
        sm = hm.subMap("10002", "10004");
        System.out.println("Between 10002 and 1004");
        show(sm);
        sm = hm.tailMap("10002");
        System.out.println("Greater than 10002");
        show(sm);
    }

    static void show(SortedMap sm) {
        Set s = sm.entrySet();
        Iterator i = s.iterator();
        while (i.hasNext()) {
            Map.Entry e = (Map.Entry) i.next();
            String k = (String) e.getKey();
            String v = (String) e.getValue();
            System.out.println(k+ "=" +v);
        }

    }
}
