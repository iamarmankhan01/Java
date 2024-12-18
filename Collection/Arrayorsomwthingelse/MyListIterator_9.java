import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MyListIterator_9 {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<Integer>();
        ListIterator<Integer> litr = null;

        li.add(23);
        li.add(93);
        li.add(25);
        li.add(53);
        li.add(24);

        litr = li.listIterator();  // Initializing ListIterator
        
        System.out.println("Elements in forward direction:");
        while (litr.hasNext()) {
            System.out.println(litr.next());
        }

        System.out.println("Elements in backward direction:");
        while (litr.hasPrevious()) {     
            System.out.println(litr.previous());
        }
    }
}
