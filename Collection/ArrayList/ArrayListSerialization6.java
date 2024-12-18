
import java.io.*;
import java.util.*;

public class ArrayListSerialization6 {
    public static void main(String[] args) {
        ArrayList<Emp> al = new ArrayList<Emp>();
        al.add(new Emp(10));
        al.add(new Emp(20));
        al.add(new Emp(30));
        try {
              FileOutputStream fos = new FileOutputStream("myfile");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(al);
            oos.close();
            fos.close();

            System.out.println("After Deserialization ");
            FileInputStream fin = new FileInputStream("myfile");
            ObjectInputStream oin = new ObjectInputStream(fin);
            ArrayList al1 = (ArrayList)oin.readObject();
            Iterator<Emp> i  = al1.iterator();
            while(i.hasNext()){
              Emp e = i.next();
              System.out.println(e.x);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Emp implements Serializable{
    int x ;
    Emp(int x){
        this.x=x;
    }
}
