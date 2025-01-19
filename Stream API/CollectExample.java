import java.util.*;
import java.util.stream.*;

public class CollectExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            list.add(i);
        }

        Stream<Integer> stream = list.stream();
        System.out.println(stream.getClass().getName());

        // Collect even numbers into a list
        List<Integer> evenNumbersList = stream.filter(i -> i % 2 == 0)
                                               .collect(Collectors.toList());
        System.out.println(evenNumbersList);
    }
}
