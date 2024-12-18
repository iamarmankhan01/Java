
import java.util.Vector;

public class EnsureCapacityEx_1{
    public static void main(String[] args) {
        Vector<String> al = new Vector<String>();
        System.out.println(al.capacity());
       // added 4 element
       al.add("Hi");
       al.add("Hello");
       al.add("Bye");
       al.add("GM");

       //Increase capacity to 76 
       al.ensureCapacity(76);
       System.out.println(al.capacity());
       System.out.println(al);
       al.add("GE");
       al.add("GE");
       al.add("GE");
       System.out.println(al.capacity());
       System.out.println(al);
       for(String temp:al){
        System.out.println(temp);
       }
    }
}