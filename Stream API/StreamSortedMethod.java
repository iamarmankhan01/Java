import java.util.*;

public class StreamSortedMethod {
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

        names.stream()
             .sorted() // Sorts the names in natural order
             .map(String::toUpperCase) // Converts each name to uppercase
             .forEach(System.out::println); // Prints each name
    }
}
