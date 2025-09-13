import java.io.FileReader;

public class readEx {
    public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("D:\\PSA\\JavaCode\\DemoText\\t1.txt");
			System.out.println((char)fr.read());
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
