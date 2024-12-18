
import java.util.Vector;

public class TrimExample_13 {
    public static void main(String[] args) {
        Vector <Integer> arrlist = new Vector<Integer>(50);
        System.out.println(arrlist.capacity());
        arrlist.add(1);
        arrlist.add(2);
        arrlist.add(3);
        arrlist.add(4);
        arrlist.add(5);
        arrlist.add(6);
        arrlist.trimToSize();
        System.out.println(arrlist.capacity());
        System.out.println(arrlist);
    }
}
