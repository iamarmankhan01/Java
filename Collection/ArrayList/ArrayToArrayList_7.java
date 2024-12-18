import java.util.*;
public class ArrayToArrayList_7 {
    public static void main(String[] args) {

        /*Array Declaration and initialization */
        String  citynamea[]={"Agra" ,"Mysore","Delhi","Bhopal"};
        List<String> l = Arrays.asList(citynamea);

        /* l.add("LKO");     (Not Supported)      */

        /*Array to ArrayList conversion */

        ArrayList<String> citylList = new ArrayList<String>(1);

        citylList.add("New City2");
        citylList.add("New City3");

        for(String str: citylList){
            System.out.println(str);
        }


    }
}
