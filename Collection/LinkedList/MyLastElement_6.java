
import java.util.LinkedList;

public class MyLastElement_6 {
    public static void main(String[] args) {
        
        LinkedList <String> arr1 = new LinkedList<String>();
        /* 
        arr1.add("First");
        arr1.add("Second");
        arr1.add("Third");
        arr1.add("Four");
        arr1.add("five");  
        */
        System.out.println("Last Element: "+arr1.getLast());
       //System.out.println("Last Element: "+arr1.peekLast());
        System.out.println("List Element: "+arr1);
    }
}

//getLast(): Returns the last element in this list but if //list is empty then it returns exception.
              /*
                * output: Exception in thread "main" java.util.NoSuchElementException
                     at java.base/java.util.LinkedList.getLast(LinkedList.java:268)
                     at MyLastElement_6.main(MyLastElement_6.java:15)
                */

//peeklast(): Retrive the last element in the list , but if list is empty then returns null.
            /*
             * Output Last Element: null
               List Element: []
             */
