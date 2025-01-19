import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToList {

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

        List<String> memNamesInUppercase = names.stream()
                .sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.print(memNamesInUppercase);
    }
}