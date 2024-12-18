
import java.util.*;

public class ArraysSortComp {

    public static void main(String[] args) {
        // Creating an array of Emp1 objects
        Emp1[] e = new Emp1[]{
            new Emp1("Lalu", 101),
            new Emp1("Rabari", 51),
            new Emp1("Meesa", 21),
            new Emp1("Tej", 11)
        };

        // Sorting by salary using MySalaryComp comparator
        Arrays.sort(e, new MySalaryComp());
        System.out.println("Sorted Array entries via Salary:");
        for (Emp1 el : e) {
            System.out.println(el.name + " = " + el.getSalary());
        }

        // Sorting by name using MyNameComp comparator
        Arrays.sort(e, new MyNameComp());
        System.out.println("Sorted Array entries via Name:");
        for (Emp1 el : e) {
            System.out.println(el.name + " = " + el.getSalary());
        }
    }
}

// Comparator to sort by salary
class MySalaryComp implements Comparator<Emp1> {

    @Override
    public int compare(Emp1 e1, Emp1 e2) {
        if (e1.getSalary() > e2.getSalary()) {
            return 1; 
        }else if (e1.getSalary() < e2.getSalary()) {
            return -1; 
        }else {
            return 0;
        }
    }
}

// Comparator to sort by name
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
