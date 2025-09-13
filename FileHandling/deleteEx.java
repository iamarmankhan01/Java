import java.io.File;

public class deleteEx {
     public static void main(String[] args) {

        File f = new File("D:\\PSA\\JavaCode\\DemoText\\t2.txt");
        boolean val = f.delete();
        System.out.println(val);

    }
}
