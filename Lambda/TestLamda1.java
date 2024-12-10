import java.util.Arrays;
import java.util.List;

public class TestLamda1 {
    public static void main(String[] args) {
        String[] str = {"arman", "saif", "sam"};
        List<String> family = Arrays.asList(str);

        // Old looping
        for (String s : family) {
            System.out.println(s + "; ");
        }
        System.out.println(" "); // Print a new line for separation

        // Using lambda expression and function operations
        family.forEach(s -> System.out.print(s + "; "));
        System.out.println(" "); // Print a new line for separation

        // Using double colon operator in Java 8
        family.forEach(System.out::println);
    }
}
