import java.util.HashMap;

public class BasicHashMap {
    public static void main(String[] args) {
          HashMap<String, String> hm = new HashMap<String, String>();

        System.out.println(hm.size());
        hm.put("first", "First Insert");
        hm.put("second", "Second Insert");
        hm.put("third", "Third Insert");
        System.out.println("My hash map content: ");
        System.out.println(hm);
        //Getting value for the given key from hashmap
        System.out.println("Value of second : "+hm.get("second"));
        System.out.println("Is HashMap empty? "+hm.isEmpty());
        hm.remove("third");
        System.out.println(hm);
        System.out.println("Size of the HashMap: "+hm.size());
    }
}
