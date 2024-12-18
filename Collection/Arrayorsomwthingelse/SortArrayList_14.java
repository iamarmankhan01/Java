
import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList_14 {
    public static void main(String[] args) {
        ArrayList<String> listfcountries = new ArrayList<String>();
        listfcountries.add("India");
        listfcountries.add("US");
        listfcountries.add("China");
        listfcountries.add("Denmark");
        listfcountries.add("China");

        /*Unsorted List */
        System.out.println("Before Sorting: ");
        for(String counter: listfcountries){
            System.out.println(counter);
        }
        /*Sort Statement */
        Collections.sort(listfcountries);

        /*Sorted List */
        System.out.println("After Sorting: ");
        for(String counter: listfcountries){
            System.out.println(counter);
        }
    }
}
