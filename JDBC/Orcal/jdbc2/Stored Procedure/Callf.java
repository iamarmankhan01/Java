import java.sql.*;
public class Callf{
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mca6");
            CallableStatement cs= c.prepareCall("{?=call sum(?,?)}");
            cs.setInt(2, 10);
            cs.setInt(3, 20);
            cs.registerOutParameter(1, Types.INTEGER);
            cs.execute();
            int a=cs.getInt(1);
            System.out.println(a);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
} 
