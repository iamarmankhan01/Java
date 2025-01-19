import java.util.*;
import java.util.stream.*;

public class StreamReduceMethod {

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

        Optional<String> reduced = names.stream()
                .reduce((s1, s2) -> s1 + "#" + s2);

        reduced.ifPresent(System.out::println);
    }
}