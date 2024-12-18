import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapCeilingKey {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        Locale locale = Locale.getDefault();

        // Manually create a map of day names to integers
        NavigableMap<String, Integer> names = new TreeMap<>();
        for (int day = Calendar.SUNDAY; day <= Calendar.SATURDAY; day++) {
            now.set(Calendar.DAY_OF_WEEK, day);
            String dayName = now.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, locale);
            names.put(dayName, day);
        }

        System.out.println("Whole list: " + names);
        System.out.println("Key ceiling after Sunday: " + names.ceilingKey("Sunday"));
        
        names.remove("Sunday");
        System.out.println("Key ceiling after Sunday (after removal): " + names.ceilingKey("Sunday"));
    }
}
