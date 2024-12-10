
import java.sql.*;

public class Lower6 {
    public static void main(String[] args) {
        try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mca6");
         Statement s = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

         int x=s.executeUpdate("update employee set empName=Lower(empName)");
         System.out.println(x);

            
        } catch(SQLException e){
            System.out.println(e);
        }
        catch (Exception i) {
            System.out.println(i);
        }
    }
}
