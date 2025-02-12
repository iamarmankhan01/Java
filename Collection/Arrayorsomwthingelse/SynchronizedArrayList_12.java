
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedArrayList_12 {
    public static void main(String[] args) {
        List<String> syncal = Collections.synchronizedList(new ArrayList<String>());

        syncal.add("Pen");
        syncal.add("NoteBook");
        syncal.add("Ink");
        System.out.println("Iterating synchronized ArrayList: ");
        synchronized (syncal) {
            Iterator<String> iterator =syncal.iterator();
            while(iterator.hasNext())
            System.out.println(iterator.next());
            
        }
    }
}
