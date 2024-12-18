import java.util.Arrays;
import java.util.Comparator;

public class ReverseOrder1 {
    public static void main(String[] args) {
        Emp1[] list = new Emp1[]{
            new Emp1("Ram", 3000),
            new Emp1("John", 6000),
            new Emp1("Crish", 2000),
            new Emp1("Tom", 2400)
        };

        Arrays.sort(list, new MySalaryComp());
        System.out.println("Sorted list entries by Salary:");
        for (Emp1 e : list) {
            System.out.println(e.getName() + ": " + e.getSalary());
        }

        Arrays.sort(list, new MyNameComp());
        System.out.println("\nSorted list entries by Name:");
        for (Emp1 e : list) {
            System.out.println(e.getName() + ": " + e.getSalary());
        }
    }
}

class MySalaryComp implements Comparator<Emp1> {
    @Override
    public int compare(Emp1 e1, Emp1 e2) {
        return Integer.compare(e1.getSalary(), e2.getSalary());
    }
}

class MyNameComp implements Comparator<Emp1> {
    @Override
    public int compare(Emp1 e1, Emp1 e2) {
        return e1.getName().compareTo(e2.getName());
    }
}

class Emp1 {
    private String name;
    private int salary;

    Emp1(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}
