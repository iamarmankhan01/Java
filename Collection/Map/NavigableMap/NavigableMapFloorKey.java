import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapFloorKey {

    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        Locale locale = Locale.getDefault();
        
        // Fetching display names for days of the week
        Map<String, Integer> names = now.getDisplayNames(Calendar.DAY_OF_WEEK, Calendar.LONG, locale);
        
        // Creating a NavigableMap
        NavigableMap<String, Integer> nav = new TreeMap<>(names);
        
        // Printing the whole map
        System.out.printf("Whole list: %n%s%n", nav);
        
        // Finding the floor key for "Sunday"
        System.out.printf("Key floor before 'Sunday': %s%n", nav.floorKey("Sunday"));
        
        // Removing "Sunday" and checking again
        nav.remove("Sunday");
        System.out.printf("Key floor before 'Sunday' (after removal): %s%n", nav.floorKey("Sunday"));
    }
}
