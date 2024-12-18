
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo2 {

    public static void main(String[] args) {
        HashSet<Emp> al = new HashSet<Emp>();
        System.out.println(al.size());
        al.add(new Emp(1002));
        al.add(new Emp(1002));
        al.add(new Emp(1002));
        System.out.println(al.size());
        Iterator i = al.iterator();
        while (i.hasNext()) {
            Emp e = (Emp) i.next();
            System.out.println(e.id);
        }
    }
}

class Emp {

    int id;

    Emp(int id) {
        this.id = id;
        System.out.println(this.hashCode());
    }
}
