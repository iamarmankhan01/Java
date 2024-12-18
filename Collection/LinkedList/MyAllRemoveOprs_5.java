
import java.util.LinkedList;

public class MyAllRemoveOprs_5 {
    public static void main(String[] args) {
        LinkedList<String> arr1 = new LinkedList<String>();
        arr1.add("First");
        arr1.add("Second");
        arr1.add("Third");
        arr1.add("Four");
        arr1.add("five");
        arr1.add("Random");
        arr1.add("Six");
        arr1.add("Seven");
        arr1.add("eight");



        System.out.println(arr1);

        System.out.println("Remove() method:" + arr1.remove());
        System.out.println("After remove method call:");
        System.out.println(arr1);

        System.out.println("remove (index) method: " + arr1.remove(2));
        System.out.println("After remove (index) method call: ");
        System.out.println(arr1);

        System.out.println("Remove (object) method: " + arr1.remove("five"));
        System.out.println("After remove (Object) method call: ");
        System.out.println(arr1);

        System.out.println("RemoveFirst() method: " + arr1.removeFirst());
        System.out.println("After removefirst () method call: ");
        System.out.println(arr1);

        System.out.println("RemoveFirstOccurrence() method: " + arr1.removeFirstOccurrence("Random"));
        System.out.println("After RemoveFirstOccurrence() method call: ");
        System.out.println(arr1);

        System.out.println("RemoveLast() method: " + arr1.removeLast());
        System.out.println("After RemoveLast()  method call: ");
        System.out.println(arr1);

        System.out.println("RemoveLastOccurrence() method: " + arr1.removeLastOccurrence("five"));
        System.out.println("After RemoveLastOccurrence()  method call: ");
        System.out.println(arr1);

    }
}
