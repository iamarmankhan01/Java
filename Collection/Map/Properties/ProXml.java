
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.Properties;

public class ProXml {

    public static void main(String[] args) throws Exception {
        Properties p = new Properties();

        p.put("today", new Date().toString());
        p.put("user", "A");

        FileOutputStream out = new FileOutputStream("user.props");
        p.storeToXML(out, "update");

        FileInputStream in = new FileInputStream("user.props");
        p.load(in);
        p.list(System.out);
        System.out.println(p.getProperty("user"));
        System.out.println(p.getProperty("today"));
        System.out.println("via get Method");
        System.out.println(p.get("user"));
        System.out.println(p.get("today"));

    }
}
