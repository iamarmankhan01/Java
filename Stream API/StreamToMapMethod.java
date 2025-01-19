import java.util.*;
import java.util.stream.Collectors;

public class StreamToMapMethod {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>(Arrays.asList(
                new Employee(1, "A", 100),
                new Employee(2, "A", 200),
                new Employee(3, "B", 300),
                new Employee(4, "B", 400),
                new Employee(5, "C", 500),
                new Employee(6, "C", 600)));

        Map<Integer, Employee> employeesMap = employeeList.stream()
                .collect(Collectors.toMap(Employee::getId, Function.identity()));

        System.out.println(employeesMap);
    }

    class Employee {
    int id;
    String name;
    int salary;

    Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "id=" + id + " " + "name=" + name + " " + "Salary=" + salary;
    }
}