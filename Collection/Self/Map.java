import java.util.*;

public class Map {
    public static void main(String[] args) {
        HashMap<String,Integer> courses = new HashMap<>();
        //adding Element
        courses.put("Core Java", 4000);
        courses.put("Basic Python", 3600);
        courses.put("Spring Boot", 9000);
        courses.put("Android", 5000);
        courses.put("Android", 5000);
        courses.put("PHP", 2600);

        System.out.println(courses);
        
    //   courses.forEach((e1,e2)->{
    //   System.out.println(e1+ "=>"+e2);
    //   });
    courses.forEach((key,value)->{
        System.out.println(key+ " => "+value);
    });


    
    //key Set Or Key set
     System.out.println(courses.get("Spring Boot"));





    }
}
