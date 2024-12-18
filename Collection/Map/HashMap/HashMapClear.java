import java.util.HashMap;

public class HashMapClear {
    public static void main(String[] args) {
        
        HashMap<String, String> hm = new HashMap<String, String>();

        System.out.println(hm.size());
        hm.put("First", "First Insert");
        hm.put("Second", "Second Insert");
        hm.put("third", "Third Insert");
        System.out.println("My hash map content: ");
        System.out.println(hm);
        System.out.println("Clearing HashMap: ");
        hm.clear();  //==================this is clear all of the collection
        System.out.println("Content after clear: ");
        System.out.println(hm);
    }
}
