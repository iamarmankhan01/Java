import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class MyVectorNewCollection_6 {
    public static void main(String[] args) {
        Vector<String> vct = new Vector<String>();
        vct.add("First");
        vct.add("Second");
        vct.add("Third");
        vct.add("Random");
        System.out.println("Actual vector: " + vct);
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("Two");
        System.out.println("After Copy: " + vct);
    }
}
