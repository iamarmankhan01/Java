import java.sql.*;
public class Length5 {
    public static void main(String[] args) throws Exception{
        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "mca6");
            Statement s = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet result1 = s.executeQuery("select * From Employee where Length(empName)>4");
            while(result1.next()){
                System.out.println(result1.getString(1));
                System.out.println(result1.getString(2));
            }            
            
        } catch (SQLException e) {
            System.out.println(e);
        }catch(Exception i){
            System.out.println(i);
        }
    }
}
