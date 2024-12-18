
import java.util.ArrayList;

public class ArrayListToArray6 {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("String1");
        arrList.add("String2");
        arrList.add("String3");
        arrList.add("String4");

        /*ArrayList to Array Conversion */

        String array[] = new String[arrList.size()];
        for(int j =0;j<arrList.size();j++){
            array[j] = arrList.get(j);
        }
        /* Displaying Array Element */
        for(String k: array){
            System.out.println(k);
        }
    }
}
