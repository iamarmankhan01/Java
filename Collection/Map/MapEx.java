import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx {
    public static void main(String[] args) {
        Map<Integer,String> m = new HashMap<>();
        m.put(3,"Atif");
        m.put(1,"Ariz");
        m.put(2,"Atifa");

        Set<Map.Entry<Integer,String>> entrySet = m.entrySet();

        for(Map.Entry<Integer,String> entry : entrySet){
            System.out.println(entry.getKey()+"---"+entry.getValue());
        }
    }
}
