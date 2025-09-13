package BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class A {
    public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("D:\\PSA\\JavaCode\\DemoText\\t6.txt",true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Ifaan");
			bw.newLine();
			bw.write(97);
			char[] ch = {'b','c','d'};
			bw.newLine();
			bw.write(ch);
			
			bw.close();
			fw.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
