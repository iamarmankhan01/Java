import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class MyTreeSet {
    public static void main(String[] args) {
        // Comparator for sorting by salary
        Comparator<Emp1> salaryComparator = new MySalaryComp();
        TreeSet<Emp1> salarySortedSet = new TreeSet<>(salaryComparator);
        
        System.out.println("Sorting by Salary:");
        addEmployees(salarySortedSet);
        displayEmployees(salarySortedSet);

        // Comparator for sorting by name
        Comparator<Emp1> nameComparator = new MyNameComp();
        TreeSet<Emp1> nameSortedSet = new TreeSet<>(nameComparator);

        System.out.println("\nSorting by Name:");
        addEmployees(nameSortedSet);
        displayEmployees(nameSortedSet);
    }

    // Method to add employees to a TreeSet
    static void addEmployees(TreeSet<Emp1> set) {
        set.add(new Emp1("Arman", 101));
        set.add(new Emp1("Atif", 102));
        set.add(new Emp1("Tabrej", 51));
        set.add(new Emp1("Aman", 21));
    }

    // Method to display employees in a TreeSet
    static void displayEmployees(TreeSet<Emp1> set) {
        Iterator<Emp1> iterator = set.iterator();
        while (iterator.hasNext()) {
            Emp1 e = iterator.next();
            System.out.println(e.name + " = " + e.salary);
        }
    }
}

// Comparator to sort employees by salary
class MySalaryComp implements Comparator<Emp1> {
    @Override
    public int compare(Emp1 e1, Emp1 e2) {
        return Integer.compare(e1.getSalary(), e2.getSalary());
    }
}

// Comparator to sort employees by name
class MyNameComp implements Comparator<Emp1> {
    @Override
    public int compare(Emp1 e1, Emp1 e2) {
        return e1.name.compareTo(e2.name);
    }
}

// Employee class
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
