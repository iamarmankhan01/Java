import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class C {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:\\PSA\\JavaCode\\DemoText\\file.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            SzlExA a1 = (SzlExA) ois.readObject();
            System.out.println(a1.name);
            System.out.println(a1.password);

            ois.close();

        } catch (Exception e) {

            e.printStackTrace();
        }

    }

}
