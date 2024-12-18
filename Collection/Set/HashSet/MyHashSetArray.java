import java.util.HashSet;

public class MyHashSetArray {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        System.out.println(hs.size());
        hs.add("first");
        hs.add("second");
        hs.add("third");
        System.out.println("hashSet content: ");
        System.out.println(hs);
        String strArr[]= new String[hs.size()];
        hs.toArray(strArr);
        System.out.println("Copied array content: ");
        for(String str:strArr){
            System.out.println(str);
        }

    }
}
