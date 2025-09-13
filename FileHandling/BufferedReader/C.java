package BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;

public class C {
    public static void main(String[] args) {
        try {
			FileReader fr = new FileReader("D:\\PSA\\JavaCode\\DemoText\\t4.txt");
			BufferedReader br = new BufferedReader(fr);
			for(int i=0;i<3;i++) {
				System.out.println(br.readLine());
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

    }
}
