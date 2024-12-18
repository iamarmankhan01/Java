import java.util.ArrayList;
import java.util.Collections;

public class ListSortComparable_14 {
    public static void main(String[] args) {
        ArrayList<Emp1> list = new ArrayList<Emp1>();
        list.add(new Emp1("Ram", 3000));
        list.add(new Emp1("John", 6000));
        list.add(new Emp1("Cric", 2000));
        list.add(new Emp1("Tomy", 7800));

        // Sorting the list using Comparable
        Collections.sort(list);

        System.out.println("Sorted list entries by salary:");
        for (Emp1 e : list) {
            System.out.println(e.getSalary());
        }

        // Finding the max and min salary using Collections
        Emp1 maxSalaryEmp = Collections.max(list);
        Emp1 minSalaryEmp = Collections.min(list);

        System.out.println("Highest Salary: " + maxSalaryEmp.getSalary());
        System.out.println("Lowest Salary: " + minSalaryEmp.getSalary());
    }
}

class Emp1 implements Comparable<Emp1> {
    String name;
    int salary;

    // Constructor
    Emp1(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter for salary
    int getSalary() {
        return salary;
    }

    // Implementing compareTo method
    public int compareTo(Emp1 e) {
        if (this.salary > e.salary)
            return 1;
        else if (this.salary < e.salary)
            return -1;
        else
            return 0;
    }
}
