import java.util.*;
import java.util.stream.*;

public class StreamFindFirstMethod {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Amitabh");
        names.add("Shekhar");
        names.add("Aman");
        names.add("Rahul");
        names.add("Lalu");
        names.add("Lalu Rabari");
        names.add("Salman");
        names.add("Yana");
        names.add("Lokesh");

        String firstMatchedName = names.stream()
                .filter((s) -> s.startsWith("L"))
                .findFirst()
                .get();

        System.out.println(firstMatchedName); 
    }
}