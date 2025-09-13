package FileWriteClass;

import java.io.FileWriter;

public class B {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("D:\\PSA\\JavaCode\\DemoText\\t5.txt", false);
			fw.write("Arman");
			fw.write("\n");
			fw.write("Ifaan");
			fw.write("\n");
			fw.write("Kaif");
			fw.close();   //Save the file content and closes the file
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
