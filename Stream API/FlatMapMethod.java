import java.util.*;
import java.util.stream.*;

public class FlatMapMethod {

    public static void main(String... s) {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8));

        List<Integer> flattenedList = listOfLists.stream()
                .flatMap(list -> list.stream()) // Flattening step
                .collect(Collectors.toList());

        System.out.println(flattenedList);
    }
}