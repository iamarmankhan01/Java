
import java.io.FileInputStream;
import java.util.Properties;


public class DatabasesApp {
    public static void main(String[] args) throws Exception {
        FileInputStream f = new FileInputStream("database.properties");

        Properties p = new Properties();

        p.load(f);

        String uname = p.getProperty("uname");
        String pwd = p.getProperty("pwd");

        System.out.println("UserName :"+uname);
        System.out.println("Password :"+pwd);

        f.close();


    }
}
