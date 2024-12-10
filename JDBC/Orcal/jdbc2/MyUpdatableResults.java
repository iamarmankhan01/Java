
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyUpdatableResults {

    public static void main(String[] args) {
        Statement st = null;
        ResultSet rs = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "mca6");
            st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = st.executeQuery("select accno, bal from bank1 ");
            rs.next();
            rs.next();
            rs.deleteRow();
            System.out.println("Record deleted");

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
