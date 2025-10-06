import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ImpClassB {
    public static void main(String[] args) {
		SzlExA a1 = new SzlExA();
		try {
			FileOutputStream fos = new FileOutputStream("D:\\PSA\\JavaCode\\DemoText\\file.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(a1);
		
			oos.close();
			fos.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
