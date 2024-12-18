import java.util.ArrayList;
import java.util.List;

public class MyArrayListSubRange_6 {
    public static void main(String[] args) {
        ArrayList<String> li = new ArrayList<String>();
        li.add("java");
        li.add("Cric");
        li.add("Play");
        li.add("Random");
        li.add("Click");
        
        System.out.println("Actual ArrayList: " + li);
        
        List<String> list = li.subList(2, 4);  // Gets a sublist from index 2 to 4 (4 is exclusive)
        System.out.println("Sub List: " + list);
    }
}
