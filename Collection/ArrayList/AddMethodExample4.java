
import java.util.ArrayList;
public class AddMethodExample4 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

        al.add("Hi");
        al.add("Hello");
        al.add("Arman");
        al.add("Test");

        al.add(3,"Sam");

        System.out.println(al);

        al.add(0,"Bye");

        System.out.println("Element after adding string bye: "+al);

    }
}
