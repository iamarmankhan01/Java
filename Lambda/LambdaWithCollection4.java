
import java.util.*;

public class LambdaWithCollection4 {

    public static void main(String[] args) {
        String str[] = {"ram", "Sayam", "Sita"};
        List<String> family = Arrays.asList(str);

        //old looping
        for (String s : family) {
            System.out.println(s + "; ");
        }
        System.out.println(" ");

        //using lambda expression and functional operations
        family.forEach((s) -> System.out.print(s + "; "));
        System.out.println("  ");
        //Using double colom operator in java 8 

        family.forEach(System.out::println);

    }
}
