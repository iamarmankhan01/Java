class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
public class oops{
    public static void main(String args[]){
        Employee h = new Employee();

        h.setName("Arman khan");
        System.out.println(h.getName());
        h.salary = 34000;
        System.out.println(h.getSalary());
        System.out.println();
    }
}   