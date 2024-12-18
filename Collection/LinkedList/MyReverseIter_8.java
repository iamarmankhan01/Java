
import java.util.Iterator;
import java.util.LinkedList;

public class MyReverseIter_8 {
    public static void main(String[] args) {
        LinkedList<String> arr1 = new LinkedList<String>();
        arr1.add("Four");
        arr1.add("five");
        arr1.add("Random");
        arr1.add("Six");
        arr1.add("Seven");
        arr1.add("eight");
        Iterator<String> itr = arr1.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
