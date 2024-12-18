
import java.util.*;

public class HashMapDemo1 {

    public static void main(String s1[]) {
        HashMap<Emp, String> hm = new HashMap<>();
        System.out.println(hm.size());
        hm.put(new Emp(10), "aaaa");
        hm.put(new Emp(10), "bbbb");
        hm.put(new Emp(10), "eccc");
        hm.put(new Emp(10), "dddd");
        Set s = hm.entrySet();
        Iterator i = s.iterator();
        while (i.hasNext()) {
            Map.Entry e = (Map.Entry) i.next();
            Emp k = (Emp) e.getKey();
            String v = (String) e.getValue();
            System.out.println(k.id + "=" + v);

        }

    }
}

class Emp {

    int id;

    Emp(int id) {
        this.id = id;
        System.out.println(this.hashCode());
    }

    public boolean equals(Object o) {
        Emp e = (Emp) o;
        System.out.println("Equals");
        if (e.id == this.id) {
            return true; 
        }else {
            return false;
        }
    }
}
