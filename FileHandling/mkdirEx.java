import java.io.File;

public class mkdirEx {
     public static void main(String[] args) {

        File f = new File("D:\\PSA\\JavaCode\\DemoText\\newFolder");
        boolean val = f.mkdir();
        System.out.println(val);

    }
}
