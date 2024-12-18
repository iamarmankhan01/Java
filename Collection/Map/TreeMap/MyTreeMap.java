
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MyTreeMap {

    public static void main(String[] args) {
        Comparator m1 = new MySalaryComp();
        Comparator m2 = new MyNameComp();
        TreeMap t = new TreeMap(m1);
        System.out.println("Sorting with Salary");
        add(t);
        show(t);
        Emp1 em = (Emp1) t.firstEntry();
        System.out.println("Lowest salary emp: " + em.salary);
        Entry<Emp1, String> ent = t.firstEntry();
        System.out.println("Entry set values: ");

        Emp1 k = (Emp1) ent.getKey();
        System.out.println(k.salary + " ==> " + ent.getValue());
        System.out.println("Sorting with Name");
        TreeMap t1 = new TreeMap(m2);
        add(t1);
        show(t1);
    }

    static void add(TreeMap t) {
        t.put(new Emp1("lalu ", 101), "Chaprasi");
        t.put(new Emp1("bhalu ", 102), "Sweaper");
        t.put(new Emp1("rabri ", 51), "Kaamwali");
        t.put(new Emp1("Messa ", 21), "ChotiMade");
    }

    static void show(TreeMap t) {
        Set s = t.entrySet();
        Iterator i = s.iterator();
        while (i.hasNext()) {
            Map.Entry e = (Map.Entry) i.next();
            Emp1 k = (Emp1) e.getKey();
            String v = (String) e.getValue();
            System.out.println(k.name + "=" + k.salary + "  , value=" + v);
        }
    }
}

class MySalaryComp implements Comparator<Emp1> {

    public int compare(Emp1 e1, Emp1 e2) {

        if (e1.getSalary() > e2.getSalary()) {
            return 1;
        } else {
            return -1;
        }
    }
}

class MyNameComp implements Comparator<Emp1> {

    public int compare(Emp1 e1, Emp1 e2) {
        return e1.name.compareTo(e2.name);
    }
}

class Emp1 {

    String name;
    int salary;

    Emp1(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    int getSalary() {
        return salary;
    }
}
