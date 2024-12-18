
import java.util.ArrayList;

public class ContainsExample_9 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("pen");
        al.add("pencil");
        al.add("ink");
        al.add("notebook");

        System.out.println("ArrarList contains the string 'ink pen ': "+al.contains("ink pen"));
        System.out.println("ArrarList contains the string ' pen ': "+al.contains("pen"));
        System.out.println("ArrarList contains the string ' pencil ': "+al.contains("pencil"));
        System.out.println("ArrarList contains the string ' book ': "+al.contains("book"));


        ArrayList<Integer> al1 = new ArrayList<Integer>();
        al1.add(1);
        al1.add(99);
        al1.add(56);
        al1.add(13);
        al1.add(44);
        al1.add(7);

        System.out.println(" '1' is present in Arraylist:  "+al1.contains(1));
        System.out.println(" '55' is present in Arraylist:  "+al1.contains(55));
        System.out.println(" '44' is there in Arraylist:  "+al1.contains(44));
        System.out.println(" '1' is there in Arraylist:  "+al1.contains(1));
    }
}
