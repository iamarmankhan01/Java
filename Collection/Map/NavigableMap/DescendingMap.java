/*The java. util. NavigableNap interface, a new addition to Java 6, inherits SortedMap to add navigation methods that allows for key/value pair searching. */

 /*-The java. util. TreeMap class in Java 6 implements NavigableMap. */
import java.util.NavigableMap;
import java.util.TreeMap;

public class DescendingMap {

    public static void main(String[] args) {
        NavigableMap<Integer, String> map = new TreeMap<Integer, String>();
        map.put(2, "Two");
        map.put(1, "One");
        map.put(3, "Three");
        System.out.println("Original map: " + map + "\n");
        NavigableMap reverse = map.descendingMap();
        System.out.println("Descending map: " + reverse + "\n");
    }
}
