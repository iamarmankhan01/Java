import java.util.*;
import java.util.stream.*;

public class ListStream {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i< 10; i++){
            list.add(i);
        }

        Stream<Integer> stream = list.stream();
        stream.forEach(p -> System.out.println(p));
    }
}