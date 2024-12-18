import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MyArrayListSort_15{
    public static void main(String[] args) {
        ArrayList<Emp1> list = new ArrayList<>();
        list.add(new Emp1("Ram", 3000));
        list.add(new Emp1("John", 6000));
        list.add(new Emp1("Cric", 2000));
        list.add(new Emp1("Tomy", 7800));

        // Sorting the list using Comparable
        Collections.sort(list,new MySalaryComp());

        System.out.println("Sorted list entries by salary:");
        for (Emp1 e : list) {
            System.out.println(e.getSalary());
        }
            Collections.sort(list,new MyNameComp());
            for(Emp1 e:list){
                System.out.println(e.name);
            }
        }
    }
    class MySalaryComp implements Comparator<Emp1>{
        public int compare(Emp1 e1,Emp1 e2){
            if(e1.getSalary()>e2.getSalary()){
                return 1;
            }else{
                return -1;
            }
        }
    }

    class MyNameComp implements Comparator<Emp1>{
        public int compare(Emp1 e1,Emp1 e2){
            return e1.name.compareTo(e2.name);
           
            }
        }
     class Emp1{
        String name;
        int salary;
        Emp1(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
       int getSalary(){
       return salary;
       }

     }
