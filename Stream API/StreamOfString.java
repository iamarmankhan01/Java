import java.util.stream.*;

public class StreamOfString {
    public static void main(String[] args) {
        // Creating a stream of characters from a string
        IntStream stream = "12345_abcdefg".chars();
        stream.forEach(p -> System.out.println(p));

        // Creating a stream of strings by splitting a string
        Stream<String> stream1 = Stream.of("A$BSC".split("\\$"));
        stream1.forEach(p -> System.out.println(p));
    }
}
