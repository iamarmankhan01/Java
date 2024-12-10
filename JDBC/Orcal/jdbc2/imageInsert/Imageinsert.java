
import java.io.File;
import java.io.FileInputStream;
import java.sql.*;

public class Imageinsert {

    public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "mca6");
        Statement st = conn.createStatement();

        st.executeUpdate("drop table image1");
        st.executeUpdate("create table image1(name varchar(15),image1 blob )");
        File file = new File(" arman.jpg");
        FileInputStream fis = new FileInputStream(file);

        PreparedStatement ps = conn.prepareStatement("insert into image1 values(?,?)");
        ps.setString(1, "arman");
        ps.setBinaryStream(2, fis, (int) file.length());
        ps.execute();
        ps.close();
        fis.close();

    }
}
