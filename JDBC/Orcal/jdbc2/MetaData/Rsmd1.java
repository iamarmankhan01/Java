import java.sql.*;

public class Rsmd1{
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mca6");

            Statement s = c.createStatement();
            ResultSet result1 =s.executeQuery("select * from emp101");
            ResultSetMetaData rsmd=result1.getMetaData();
            int count = rsmd.getColumnCount();
            System.out.println(count);
            for(int i=1;i<=count;i++){
                System.out.println(rsmd.getColumnClassName(i));
                System.out.println(rsmd.getColumnTypeName(i));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}