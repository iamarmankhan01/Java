import java.util.*;
public class UntypeSafe {
   public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.add("Arman");
    list.add(1111);
    list.add(2222.33);
    list.add(true);
    System.out.println(list);
   } 
}
