import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class MyListIterator_3{
    public static void main(String[] args) {
        List<Integer>li = new Vector<Integer>();
        ListIterator<Integer> litr = null;
        li.add(23);
        li.add(83);
        li.add(29);
        li.add(43);
        li.add(11);
        litr = li.listIterator();
        System.out.println("Element is forward direction: ");
        while(litr.hasNext()){
            System.out.println(litr.next());
        }
        System.out.println("Element is backward direction:");
        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }
        
    }
}