import java.util.ArrayList;
import java.util.Iterator;

public class MyItrRemoveElement_8 {
    public static void main(String[] args) {
        String removeElm = "Perl";  // Consistent variable name
        ArrayList<String> MyList = new ArrayList<String>();
        MyList.add("java");
        MyList.add("Cric");
        MyList.add("Play");
        MyList.add("move");
        MyList.add("giri");

        System.out.println("Before Remove: ");
        System.out.println(MyList);

        Iterator<String> itr = MyList.iterator();  
        while (itr.hasNext()) {
            if (removeElm.equals(itr.next())) {  // Consistent variable name
                itr.remove();
            }
        }

        System.out.println("After Remove: ");
        System.out.println(MyList);
    }
}
