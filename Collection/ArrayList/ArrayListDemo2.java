
import java.util.*;
class ArrayListDemo2{
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        int x[] ={1,-1,2,-2,3,-3,4,-4};
        for(int i=0;i<x.length;i++){
        al.add(x[i]);      //new Integer (x[i]) jdk1.4
       }
       Object o[]=al.toArray();
       for(int i=0;i<o.length;i++){
        Integer z = (Integer) o[i];
        System.out.println(z.intValue()+ " ");
       }
       System.out.println(" ");
       for(Integer i:al){
        System.out.println(i.intValue() + " ");
       }
    }
}
