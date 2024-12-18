
import java.util.HashMap;

public class MyHashMapCopy {

    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<String, String>();

        System.out.println(hm.size());
        hm.put("First", "First Insert");
        hm.put("Second", "Second Insert");
        hm.put("third", "Third Insert");
        System.out.println(hm);

        HashMap<String, String> subMap = new HashMap<String, String>();
        subMap.put("s1", "  S1 VALUE");
        subMap.put("s2", "  S2 VALUE");
        hm.putAll(subMap); //this is all collection are add...
        System.out.println(hm);

    }
}
