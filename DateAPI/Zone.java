import java.time.ZoneId;
import java.util.*;

class Zone{
    public static void main(String[] args) {
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        TreeSet<String> t = new TreeSet<>(zoneIds);
        for (String zoneId: t) {
            System.out.println(zoneId);
        }
    }
}