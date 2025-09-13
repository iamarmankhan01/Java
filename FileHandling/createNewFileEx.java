import java.io.File;
import java.io.IOException;

public class createNewFileEx {
    public static void main(String[] args) {
        try {
            File f = new File("D:\\PSA\\JavaCode\\DemoText\\IamNewFile.txt");
            boolean val = f.createNewFile();
            System.err.println(val);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
