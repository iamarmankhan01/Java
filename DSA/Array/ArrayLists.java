import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists{
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<Integer>();
        //add elements
        list.add(0);
        list.add(1);
        list.add(3);
        System.out.println(list);


        //get elements
        int elements=list.get(2);
        System.out.println(elements);
        
        //add element in between
        list.add(2,2);
        System.out.println(list);

        //Set Element

        list.set(0,5);
        System.out.println(list);

        //delete element
        list.remove(2);
        System.out.println(list);

        //size jannne ke liye
        int size=list.size();
        System.out.println(size);

        //loops 
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
          System.out.println();
        //Sorting
        Collections.sort(list);
        System.out.println(list);



      
        // ArrayList<String> list2 = new ArrayList<String>();
        // ArrayList<Boolean> list3=new ArrayList<Boolean>();
        
    }
}