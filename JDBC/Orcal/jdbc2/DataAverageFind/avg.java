import java.sql.*;

public class avg{
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mca6");
            Statement s = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet result1 = s.executeQuery("Select avg(empSalary) FROM Employee");
            while(result1.next()){
                System.out.println(result1.getDouble(1));
            }


        } catch (SQLException e) {
            System.out.println(e);
        }
    }

}