import java.util.List;
import java.util.Vector;

public class MyVectorSubRange_7 {
    public static void main(String[] args) {
        Vector<String> vct = new Vector<String>();
                vct.add("First");
        vct.add("Second");
        vct.add("Third");
        vct.add("Random");
        System.out.println("Actual vector: " + vct);
        List<String> list = vct.subList(1, 4);
        System.out.println("Sub List: " + list);
    }
}
