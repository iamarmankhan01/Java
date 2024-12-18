
import java.util.ArrayList;

public class MyArrayListClone_3 {
    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<String>();
        //adding elements to the end
        arr1.add("First");
        arr1.add("Second");
        arr1.add("Third");
        arr1.add("Rendom");
        System.out.println("Actual ArrayList: "+arr1);

        ArrayList<String> copy = (ArrayList<String>) arr1.clone();
        System.out.println("Cloned ArrayList: " +copy);

        if(arr1.get(0)==copy.get(0)){
            System.out.println("Shallow");
        }if (arr1 !=copy) {
            System.out.println("Clone");      
        }
    }
}
