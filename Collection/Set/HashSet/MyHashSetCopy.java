import java.util.HashSet;

public class MyHashSetCopy {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        System.out.println(hs.size());
        hs.add("first");
        hs.add("second");
        hs.add("third");

        HashSet<String> subSet = new HashSet<String>();
        subSet.add("s1");
        subSet.add("third");
        hs.addAll(subSet);
        System.out.println("HashSet content after adding another collection: ");
        System.out.println(hs);

    }
}
