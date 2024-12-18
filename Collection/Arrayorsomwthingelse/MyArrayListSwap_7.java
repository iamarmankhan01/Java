import java.util.ArrayList;
import java.util.Collections;

public class MyArrayListSwap_7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("java");
        list.add("Cric");
        list.add("Play");
        list.add("move");
        list.add("giri");
        System.out.println(list);
        Collections.swap(list, 2, 5);
        System.out.println("Resulta after swap operation: ");
        for(String str:list){
            System.out.println(str);
        }
    }
}
