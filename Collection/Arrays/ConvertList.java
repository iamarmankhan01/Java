
import java.util.Arrays;
import java.util.List;

public class ConvertList {

    public static void main(String[] args) {
        String[] cars = {"Honda", "BMW", "Verna", "Ford"}; // Corrected array initialization
        List<String> carList = Arrays.asList(cars); // Convert array to list

        System.out.println(carList.getClass().getName()); // Print the class name of the list

        // Uncommenting the below line will throw UnsupportedOperationException because Arrays.asList returns a fixed-size list
        // carList.add("Merc");
        // Iterate over the list and print each car
        for (String car : carList) {
            System.out.println(car);
        }
    }
}
