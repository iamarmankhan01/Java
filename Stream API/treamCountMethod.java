import java.util.*;
import java.util.stream.*;

public class StreamCountMethod {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Amitabh");
        names.add("Shekhar");
        names.add("Aman");
        names.add("Rahul");
        names.add("Shahrukh");
        names.add("Salman");
        names.add("Yana");
        names.add("Lokesh");

        long totalMatched = names.stream()
                .filter((s) -> s.startsWith("A"))
                .count();

        System.out.println(totalMatched); 
    }
}