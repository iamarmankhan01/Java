import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample_2 {
    public static void main(String[] args) {
        /* Linked list Declaration */
        LinkedList<Emp> linkedList = new LinkedList<Emp>();

        /* add(Emp Element) is used for adding the element to the linked list */
        linkedList.add(new Emp(1001, "lalu"));
        linkedList.add(new Emp(1002, "Rabri"));
        linkedList.add(new Emp(1003, "Messa"));
        linkedList.add(new Emp(1004, "lalubeta"));
        linkedList.add(new Emp(1005, "lalupota"));

        /* Display LinkdList Content */
        Iterator<Emp> i = linkedList.iterator();
        while (i.hasNext()) {
            Emp e = i.next();
            System.out.println(e.id + " " + e.name);
        }
        /* Adding first and last element */
        linkedList.addFirst(new Emp(100, "nitish"));
        linkedList.addFirst(new Emp(200, "Akhilesh"));
        System.out.println("LinkeList Content after addition: ");
        i = linkedList.iterator();
        while (i.hasNext()) {
            Emp e = i.next();
            System.out.println(e.id + " " + e.name);
        }
        /* This is how to get and set Values */
        Emp firstvar = (Emp) linkedList.get(0);
        System.out.println("First element: " + firstvar.id + " " + firstvar.name);
        Emp e2 = new Emp(420, "Nitish420");
        linkedList.set(0, e2);
        firstvar = (Emp) linkedList.get(0);
        System.out.println("First element after update by set method: " + firstvar.id + " " + firstvar.name);

        /* Remove first and last element */
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(("Linked list after the deletion of first and last element: "));
        i = linkedList.iterator();
        while (i.hasNext()) {
            Emp e = i.next();
            System.out.println(e.id + " " + e.name);
        }
        /* Add to a position and remove from a postion */
        e2 = new Emp(421, "Nitish421");
        linkedList.add(0, e2);
        linkedList.remove(2);
        System.out.println("Final Content: ");
        i = linkedList.iterator();
        while (i.hasNext()) {
            Emp e = i.next();
            System.out.println(e.id + " " + e.name);
        }
        firstvar = (Emp) linkedList.getFirst();
        Emp lastvar = (Emp) linkedList.getLast();
        System.out.println("First Element: " + firstvar.id + " " + firstvar.name);
        System.out.println("Last Element" + lastvar.id + " " + lastvar.name);
    }
}

class Emp {
    int id;
    String name;

    Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
