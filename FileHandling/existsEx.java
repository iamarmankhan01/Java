import java.io.File;

public class existsEx {
    public static void main(String[] args) {

        File f = new File("D:\\PSA\\JavaCode\\DemoText\\t1.txt");
        boolean val = f.exists();
        System.out.println(val);

    }
}
