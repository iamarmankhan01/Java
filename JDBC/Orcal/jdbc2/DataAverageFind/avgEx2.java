
import java.sql.*;
public class avgEx2 {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mca6");
            int t1 = 123;
            String t2 = "Siya";
            Statement s = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet result1 = s.executeQuery("select * from Employee where empSalary > (select avg(102.empSalary)From Employee 102)");

            while(result1.next()){
                System.out.println(result1.getString(t1));
                System.out.println(result1.getString(t2));
            }

        } catch (SQLException e) {
            System.out.println(e);
        }catch(Exception i){
            System.out.println(i);
        }
    }
}
