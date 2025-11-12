import java.util.Map;
import java.util.HashMap;

public class MapExHashCode {
    public static void main(String[] args) {
        Map<String,String> a = new HashMap<>();
        a.put("India", "New Delhi");

        System.out.println("India".hashCode());  // Prints the hash code of "India"
        System.out.println(70793495 % 16);       // Simulates HashMap bucket index
    }
}
