/*The pollFirstEntry() method returns and removes the "first" entry (key + value) in the NavigableMap or null if the map is empty. The pollLastEntry () returns and removes the
"last" element in the map or null if the map is empty. "First" means smallest element according to the sort order of the keys. "Last" means largest key according to the element sorting order of the map. */

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {

    public static void main(String[] args) {

        NavigableMap<Integer, String> map = new TreeMap<Integer, String>();
        map.put(2, "Two");
        map.put(1, "One");
        map.put(3, "Three");
        System.out.println("Original map: " + map + "\n");
        Entry firstEntity = map.pollFirstEntry();
        System.out.println("First entry: " + firstEntity);
        System.out.println("After polling the first entry: " + map + "\n");

        Entry lastEntry = map.pollFirstEntry();
        System.out.println("Last entry: " + lastEntry);
        System.out.println("After polling last entry: " + map);
    }
}
