import java.util.*;
import java.util.stream.*;

public class ParallelismStream {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i< 10; i++){
            list.add(i);
        }

        //Here creating a parallel stream
        Stream<Integer> stream = list.parallelStream();

        Integer[] evenNumbersArr = stream.filter(i -> i%2==0).toArray(Integer[]::new);

        for(int z:evenNumbersArr)
            System.out.print(z);
    }
}