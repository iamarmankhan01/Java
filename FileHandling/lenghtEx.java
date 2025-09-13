import java.io.File;

public class lenghtEx {
    public static void main(String[] args) {
        File f = new File("D:\\PSA\\JavaCode\\DemoText\\t2lenght.txt");
        long val = f.length();
        System.out.println(val);
    }
}
