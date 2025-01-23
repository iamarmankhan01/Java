import java.util.Arrays;
import java.util.List;

public class FirstDemo{
    public static void main(String[] args) {
        
    //     Stream<Integer> stream1 = Stream.of(1,2,3,4,5);
    //     System.out.println(stream1);

    //     ArrayList<String> names = new ArrayList<>();
    //     names.add("kaif");
    //     names.add("Isara");
    //     names.add("Saif");

    //     Stream<String> stream2 = names.stream();
    //    System.out.println(stream2);


    
  //*********************************** */

  List<Integer> list =Arrays.asList(5,21,2,34,5,65,42,44,21,45);

/*  old approach
 for(Integer i:list){
    if(i>20){
        System.out.println(i);
    }
  }
    */

    /* 
  Stream<Integer> stream = list.stream();
  Stream<Integer> filter = stream.filter(i -> i>30);
  filter.forEach(i -> System.out.println(i));  */

  /*list.stream().filter(i -> i>20).forEach(i -> System.out.print(i +" "));    */
    

  List <String> names = Arrays.asList("Arif","Safi","RIyaz","Atif","Aslam","Kaif","Saif");

  names.stream().filter(i -> i.startsWith("A")).forEach(i -> System.out.print(i+ " "));

    }
}