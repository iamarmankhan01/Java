import java.io.File;

public class listEx {
    public static void main(String[] args) {
        File f = new File("D:\\PSA\\JavaCode\\DemoText\\");
			String[] val = f.list();
			for(String x: val) {
				System.out.println(x);
			}
			System.out.println(val.length);

    }
}
