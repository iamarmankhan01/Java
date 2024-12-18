
import java.util.HashMap;
public class HashMapClone {

    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        System.out.println("Oringinal HashMap : " + hashMap);

        HashMap hashMap1 = (HashMap) hashMap.clone();

        System.out.println("Copied hashMap : " + hashMap1);
    }
}
