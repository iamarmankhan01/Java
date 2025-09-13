package BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;

public class B {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("D:\\PSA\\JavaCode\\DemoText\\t4.txt");
            BufferedReader br = new BufferedReader(fr);
            char[] ch = new char[4];
            br.read(ch);
            for (char c : ch) {
                System.out.println(c);
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
