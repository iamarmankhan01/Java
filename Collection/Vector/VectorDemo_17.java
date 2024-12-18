import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo_17{
    public static void main(String[] args) {
        Vector<String> al = new Vector<>(3, 2);

        System.out.println("Initial Capacity: " + al.capacity());
        System.out.println("Initial Size: " + al.size());

        al.addElement("a");
        al.addElement("b");
        al.addElement("c");
        al.addElement("d");

        System.out.println("Capacity after additions: " + al.capacity());
        System.out.println("Size after additions: " + al.size());

        al.removeElementAt(2); // Remove element at index 2 ("c")
        System.out.println("After removing element at index 2:");

        // Enumeration to display elements
        Enumeration<String> e1 = al.elements();
        System.out.print("Using Enumeration: ");
        while (e1.hasMoreElements()) {
            String s = e1.nextElement();
            System.out.print(s + " ");
        }
        System.out.println();

        // Iterator to display elements
        System.out.println("Using Iterator:");
        Iterator<String> e = al.iterator();
        while (e.hasNext()) {
            String s = e.next();
            System.out.println(s);
        }

        // Trim vector size to fit the current number of elements
        al.trimToSize();
        System.out.println("Capacity after trimToSize: " + al.capacity());
    }
}
