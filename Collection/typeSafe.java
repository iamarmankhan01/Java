import java.util.*;

public class typeSafe {
    public static void main(String[] args) {
        ArrayList<String> names= new ArrayList<String>();
        names.add("Arman Khan");
        names.add("Tabrej Khan");
        names.add("Atif ");
        names.add("Sam Khan");
        names.add("Arman Khan");
       // System.out.println(names);

        //Get Element
        // System.out.println(names.get(0));
        // System.out.println(names.get(2));
       
        //Remove element
        // names.remove("Sam Khan");
        // System.out.println(names);

        //size of list

         //System.out.println("SIZE ="+names.size());

         //Checke itme is there or not
         //Type ka equals method call karta hai checking karne ke liye

         //System.out.println(names.contains("Arman Khan"));
         
         //Check for Empty
         //System.out.println(names.isEmpty());

         //Setting value
        //  names.add(1,"Saif");
        //  System.out.println(names);
   
      
      //Vector use +++++++++++============

        // Vector<String> vector=new Vector<>();
        // vector.addAll(names);
        // System.out.println("Vecto===="+vector);

       System.out.println("____________________"); 

       HashSet<Double> nms = new HashSet<>();
       nms.add(12.45);
       nms.add(234.533);
       nms.add(789.44);
       nms.add(12.45);
       nms.add(5.3);
      // System.out.println(nms);

    TreeSet<Double> tset=new TreeSet<>();
    tset.addAll(nms);
    System.out.println(tset);


    }
}
