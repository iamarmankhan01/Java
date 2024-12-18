
import java.util.ArrayList;

public class ContainsExampleEmp_10 {
    public static void main(String[] args) {
        
        ArrayList<Emp> list = new  ArrayList<Emp>();
        Emp e2 =new Emp(101);
       // list.add(new Emp(101));
        list.add(new Emp(102));
        list.add(new Emp(103));
        list.add(new Emp(104));
        list.add(new Emp(105));

        list.add(new Emp(101));
        System.out.println("Actual List: ");
        for(Emp e:list){
            System.out.println(e.id);
        }
        System.out.println("ArrayList contains the id 101 "+list.contains(e2));
        
    }
}
       class Emp{
        int id;
        Emp(int id){
            this.id=id;
        }
        public boolean equals(Object o){
            System.out.println("Check");
            Emp e = (Emp)o;
            if(this.id==e.id)
            return true;
            else
            return false;
        }
       }
