import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MyHashMapEntrySet {
    public static void main(String[] args) {
       HashMap<String, String> hm = new HashMap<String, String>();

        System.out.println(hm.size());
        hm.put("First", "First Insert");
        hm.put("Second", "Second Insert");
        hm.put("third", "Third Insert");

        //Gitting value for the given key from hashmap
        Set<Entry<String,String>> entires= hm.entrySet();
        for(Entry<String,String> ent:entires){
            System.out.println(ent.getKey()+"==> "+ent.getValue());
        }
        
    }
}
