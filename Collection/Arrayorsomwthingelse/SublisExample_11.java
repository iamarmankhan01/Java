
import java.util.ArrayList;
import java.util.List;

public class SublisExample_11 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        //Adding of elements in ArrayList
        al.add("Amit");
        al.add("Ariz");
        al.add("Atif");
        al.add("Saif");
        al.add("Virat");
        al.add("Dhoni");

        System.out.println("Original ArrayList Content: "+al);

        //Sublist to ArrayList
        ArrayList<String> al2 = new ArrayList<String>(al.subList(1, 4));
        System.out.println("SubList stored in ArraList: "+al2);

         //Sublist to List
        List<String> list =al.subList(1, 4);
        System.out.println("SubList stored in List: "+list);
    }
}
