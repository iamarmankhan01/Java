
import java.util.*;
class ArrayListDemo1{
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<Integer>();
        // ArrayList al = new ArrayList ();
       int x[] ={1,-1,2,-2,3,-3,4,-4};
       for(int i=0;i<x.length;i++){
        al.add(x[i]);      //new Integer (x[i]) jdk1.4
       }
        System.out.println(al);

        Iterator<Integer> i=al.iterator();
        System.out.println(i.getClass().getName());

       // Iterator i =al.iterator();

       while(i.hasNext()){                    
        //Integer z=(Integer)i.next();
        Integer z =  i.next();
        if(z.intValue()<0)
        i.remove();
        /* Difference b/w hasNext() & next()
        => hasNext(): This method returns true if the iterator has more elements. 
        => next(): This method returns the next element and also moves to the next element.12 */
       }
        System.out.println(al);
    }
}
