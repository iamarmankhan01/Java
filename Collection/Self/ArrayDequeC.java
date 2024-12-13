import java.util.*;
public class ArrayDequeC {
    public static void main(String[] args) {
        ArrayDeque<Integer> add1=new ArrayDeque<>();
        add1.add(23);
        add1.add(9);
        add1.add(123);
        add1.add(263);
        add1.add(26);
        add1.addFirst(1);
        add1.addLast(999);
        System.out.println(add1.getFirst());  
        System.out.println(add1.getLast());
        System.out.println(add1);
        
    }
}
