import java.util.HashSet;
import java.util.Iterator;
public class Hashing{
    public static void main(String[] args) {
        //Creating
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(3);
        set.add(2);   //list.add(el)

        //Print the set value
       // System.out.println(set);

        //===========Size
       // System.out.println(set.size());

        //==========Search = Conatins
        // if(set.contains(1)){
        //     System.out.println("Set Content 1");
        // }if(!set.contains(6)){
        // System.out.println("Does not Content");
        // }
      
        // ============Delete 
        // set.remove(1);
        // if(!set.contains(1)){
        //     System.out.println("Does not contain 1 - we deleted 1");
        // }

        //==========Iterator=====
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }
}