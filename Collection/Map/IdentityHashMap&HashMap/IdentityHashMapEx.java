/*There is also a class called IdentityHashtable which is analogous to Hashtable in Java but its not part of standard JDK and available in com. sun... package.
Example of IdentityHashMap in Java.
Here is an example of IdentityHashMap in Java which shows key difference between HashMap and IdentityHashMap in comparing Objects. IdentityHashMap uses equality operator for comparison instead of equals method in Java : */

import java.util.IdentityHashMap;
import java.util.HashMap;

public class IdentityHashMapEx {

    public static void main(String args[]) {
        IdentityHashMap<String, String> identityMap = new IdentityHashMap<String, String>();

        HashMap<String, String> Map1 = new HashMap<String, String>();
        identityMap.put("sony", "bravia");
        identityMap.put(new String("sony"), "mobile");

        Map1.put("sony", "bravia");
        Map1.put(new String("sony"), "mobile");

        identityMap.put("sony", "bravia");
        identityMap.put(new String("sony"), "mobile");

        Map1.put("sony", "bravia");
        Map1.put(new String("sony"), "mobile");

//size of identityMap should be 2 here because two strings are different objects
        System.out.println("Size of IdentityHashMap:" + identityMap.size());
        System.out.println("Size of HashMap: " + Map1.size());
        System.out.println("IdentityHashMap: " + identityMap);
        System.out.println("HashMap: " + Map1);
        identityMap.put("sony", "videogame");

//size of identityMap still should be 2 because "sony" and "sony" is same object
        System.out.println("Size of IdentityHashMap: " + identityMap.size());
        System.out.println("IdentityHashMap: " + identityMap);
    }
}
