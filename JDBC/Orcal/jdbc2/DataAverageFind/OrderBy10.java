
import java.sql.*;
public class OrderBy10{
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mca6");
            Statement s = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet result1 = s.executeQuery("Select*From Employee order by empsalary desc");

            while(result1.next()){
                System.out.println(result1.getString(1));
                System.out.println(result1.getString(2));
            }
            
        } catch(SQLException i){
            System.out.println(i);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        
    }
}

