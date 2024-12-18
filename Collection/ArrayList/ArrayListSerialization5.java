
import java.io.*;
import java.util.ArrayList;

public class ArrayListSerialization5 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Hello");
        al.add("Hii");
        al.add("Howday");

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
            System.out.println(al1);
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
