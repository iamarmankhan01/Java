
import java.util.Set;
import java.util.TreeSet;

public class MySetSublist {

    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("RED");
        ts.add("ORANGE");
        ts.add("BLUE");
        ts.add("GREEN");
        ts.add("WHITE");
        ts.add("BROW");
        ts.add("YELLOW");
        ts.add("BLACK");
        System.out.println(ts);
        Set<String> subSet = ts.subSet("GREEN", "WHITE");
        System.out.println("Sub set: " + subSet);
        subSet = ts.subSet("GREEN", true, "WHITE", true);
        System.out.println("Sub Set: " + subSet);
        subSet = ts.subSet("GREEN", false, "WHITE", true);
        System.out.println("Sub Set: " + subSet);
        subSet = ts.tailSet("GREEN");
        System.out.println("Sub Set: " + subSet);
        subSet = ts.headSet("WHITE");
        System.out.println("Sub Set: " + subSet);

    }
}
