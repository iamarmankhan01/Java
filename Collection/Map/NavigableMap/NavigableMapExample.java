
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapExample {

    public static void main(String[] args) {
        NavigableMap<String, String> navigableMap = new TreeMap<String, String>();
        navigableMap.put("C++", "Good programming language ");
        navigableMap.put("Java ", " Best programming language ");
        navigableMap.put("Scala ", " Another JVM language");
        navigableMap.put("Python ", "Language which Google use ");

        System.out.println("SortedMap : " + navigableMap + "\n");

        //lowerKey returns key which is less than specified key
        System.out.println("lowerKey from Java: " + navigableMap.lowerKey("Java"));

        //floorKey returns key which is less than or equal to specified key
        System.out.println("floorKey from Java: " + navigableMap.floorKey("'Java"));

        //Apart from navigation methodk, it also provides useful method.
        //to create subMap from existing Map e. g. tailMap,  headMap and subMap.
        //an example of headMap - returns NavigableMap whose key is less than specified
        NavigableMap<String, String> headMap = navigableMap.headMap("Python", false);
        System.out.println("headMap created form navigableMap : " + headMap);

        //an example of tailMap - returns NavigableMap whose key is greater than specified
        NavigableMap<String, String> tailMap = navigableMap.tailMap("Scala",
                false);
        System.out.println("tailMap created form navigableMap: " + tailMap);

        //an example of subMap - return NavigableMap from toKey to fromKey
        NavigableMap<String, String> subMap = navigableMap.subMap("C++", false,
                "Python", false);
        System.out.println("subMap created form navigableMap: " + subMap);

    }
}
