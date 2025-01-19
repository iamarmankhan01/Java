import java.util.*;
import java.util.stream.*;

public class StreamMatchMethod {

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

        boolean matchedResult = names.stream()
                .anyMatch((s) -> s.startsWith("A"));

        System.out.println(matchedResult); // Output: true

        matchedResult = names.stream()
                .allMatch((s) -> s.startsWith("A"));

        System.out.println(matchedResult); // Output: false

        matchedResult = names.stream()
                .noneMatch((s) -> s.startsWith("A"));

        System.out.println(matchedResult); // Output: false
    }
}