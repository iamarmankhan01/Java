import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapCeilingKey1 {
    public static void main(String[] args) {
        NavigableMap<String, String> navigableMap = new TreeMap<String, String>();
        navigableMap.put("C++","Good programming language ");
        navigableMap.put("Java "," Best programming language ");
        navigableMap.put("Scala "," Another JVM language");
        navigableMap.put("Python ","Language which Google use ");
        System.out.println("SortedMap : "+navigableMap+ "\n");

        //ceilingKry returns key which is greater that or equals to specified key

        System.out.println("CeilingKey from java: "+navigableMap.ceilingKey("Java"));
        navigableMap.remove("Java");
        System.out.println("CeilingKey from Java: "+navigableMap.ceilingKey("java"));

    }
}
