import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PSAStream{
    public static void main(String[] args) {
        //A Stream is a sequence of elements from a source (like List, Set, Array) that supports functional-style operations such as filtering, mapping, and reducing.

        //***************Predicate function use *************
        //===================================================
        /* 
        Predicate<Integer> val = x->x%2==0;
        boolean result = val.test(10);
        System.out.println(result);
        */

        //===================================================
        /* 
        Predicate <String> str = s->s.startsWith("a");
        boolean result = str.test("arman");
        System.out.println(result);
        */

        //===================================================
        /* 
        Predicate <String>  str1= s->s.endsWith("a");
        boolean result1 = str1.test("Arman");
        System.out.println(result1);
        */

        //***************Stream,Filter,Collect **************
        //===================================================
        /*
        List<Integer> arr = Arrays.asList(10,20,21,13,25,44);
        List<Integer>resultArrr = arr.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println(resultArrr);
        */

        //===================================================
        /*
        List<String> strArr = Arrays.asList("Sam","Kaif","Saif");
        List<String> newStr = strArr.stream().filter(x->x.startsWith("S")).collect(Collectors.toList());
        System.out.println(newStr); 
        */

       //******************** Function *********************
       //===================================================
       /*
       Function<Integer, Integer> val = x->x+10;
       Integer result = val.apply(100);
       System.out.println(result);
       */

       //===================================================
       /*
       Function<String,String> str = s->s.toUpperCase();
       String result = str.apply("streamapi");
       System.out.println(result);
        */

       //******************** Collection *********************
       //================Increment 10 each index==============
       /*
       List<Integer> arr = Arrays.asList(100,120,160,145,230);
       List<Integer> newArr = arr.stream().map(n->n+10).collect(Collectors.toList());
       System.out.println(newArr);
       */
      
      //================String Upper Case====================
      /*
       List<String> arr = Arrays.asList("Sam","Kaif","Saif");
       List<String> newArr = arr.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
       System.out.println(newArr);
       */

      //=================Distinct String=====================
       /*
       List<String> arr = Arrays.asList("Sam","Kaif","Saif","Sam","Kaif");
       List<String> newArr = arr.stream().distinct().collect(Collectors.toList());
       System.out.println(newArr);
       */

      //=================Distinct Integer====================
      /*
       List<Integer> arr = Arrays.asList(100,120,160,120,145,230,100,145,100);
       List<Integer> newArr = arr.stream().distinct().collect(Collectors.toList());
       System.out.println(newArr);
       */

      //######################29/01/26##38:02##################
      //=====================Unique Value======================
      /*
      List<Integer> arr = Arrays.asList(10,21,10,25,30,25);
      List<Integer> newArr = arr.stream().distinct().collect(Collectors.toList());
      System.out.println(newArr);
      */

      //=====================10 above and increments 5======================
      /*
      List<Integer> arr = Arrays.asList(10,21,10,25,30,25);
      List<Integer> newArr = arr.stream().distinct().filter(n->n>10).map(n->n+5).collect(Collectors.toList());
      System.out.println(newArr);
      */

      //IMP====================Max Salaries find======================
      /*
      List<Integer> salaries = Arrays.asList(12000,26000,13000,25000,30000,23000);
      Integer val = salaries.stream().max(Integer::compareTo).get();
      System.out.println(val);
      */

      //IMP====================Min Salaries find======================
      /*
      List<Integer> salaries = Arrays.asList(12000,26000,13000,25000,30000,23000);
      Integer val = salaries.stream().min(Integer::compareTo).get();
      System.out.println(val);
      */

      //IMP====================2nd Max Salaries find======================
      /*
      List<Integer> salaries = Arrays.asList(12000,26000,13000,25000,30000,23000);

      Integer secondMax = salaries.stream().sorted(Comparator.reverseOrder())
                          .skip(1).findFirst().get();
      //Write the find value in the skip place 
      System.out.println(secondMax);
     */

      //******************************30/01/26*****35:30***********************
     // =============================Supplier==================================
     /* 
      Supplier<String> x = ()->"Hello Supplier";
      System.out.println(x.get());
      */

    //===================================Max Value==============================
     /*
      List<Integer> arr = Arrays.asList(10,20,35,200);
      Integer val = arr.stream().max(Integer::compareTo).orElseGet(()->0);
      System.out.println(val);
      */

      // ******************************Consumer*********************************
     /* 
      Consumer<String> x = n->System.out.println(n);
      x.accept("Arman");
     */

     // ******************************ForEach************************************
     /* 
      List<Integer> list = List.of(10, 20, 30, 40);
      list.stream().forEach(n->System.out.println(n));
      */
     // ******************************ForEach************************************


    }

}