import java.util.*;
import java.util.stream.*;

public class CollectToArray {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            list.add(i);
        }

        Stream<Integer> stream = list.stream();
        System.out.println(stream.getClass().getName());

        // Collect even numbers into an array
        Integer[] evenNumbersArr = stream.filter(i -> i % 2 == 0).toArray(Integer[]::new);

        for (int z : evenNumbersArr) {
            System.out.println(z);
        }
    }
}
