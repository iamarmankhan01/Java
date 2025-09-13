package FileWriteClass;

import java.io.FileWriter;
import java.io.IOException;

public class A {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("D:\\PSA\\JavaCode\\DemoText\\t4.txt", false);
            fw.write(98);   //write(int x)
            fw.write("Arman");  //write(String x)
            fw.write(101);

            char[] ch = { 'v', 'b', 'j' };
            fw.write(ch);   //write(char[] x)
            fw.close();    //Save the file content and closes the file

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
