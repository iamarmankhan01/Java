package BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;

public class A {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("D:\\PSA\\JavaCode\\DemoText\\t4.txt");
            BufferedReader br= new BufferedReader(fr);
            System.out.println((char)br.read());
            br.close();
            fr.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
