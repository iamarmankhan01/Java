import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapLastKey {

    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        Locale locale = Locale.getDefault();
        
        // Fetch display names for days of the week
        Map<String, Integer> names = now.getDisplayNames(Calendar.DAY_OF_WEEK, Calendar.LONG, locale);
        
        // Create a NavigableMap
        NavigableMap<String, Integer> nav = new TreeMap<>(names);
        
        // Printing the whole map
        System.out.printf("Whole list: %n%s%n", nav);
        
        // Printing the last key and last entry
        System.out.printf("Last key: %s, Last entry: %s%n", nav.lastKey(), nav.lastEntry());
        
        // Printing the lower key for "Sunday"
        System.out.printf("Key lower before 'Sunday': %s%n", nav.lowerKey("Sunday"));
        
        // Printing the floor key for "Sunday"
        System.out.printf("Key floor before 'Sunday': %s%n", nav.floorKey("Sunday"));
        
        // Printing the ceiling key for "Sunday"
        System.out.printf("Key ceiling after 'Sunday': %s%n", nav.ceilingKey("Sunday"));
    }
}
