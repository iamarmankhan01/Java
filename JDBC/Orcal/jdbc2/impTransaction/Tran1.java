
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class Tran1{
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mca6");

            Statement s = c.createStatement();
            c.setAutoCommit(false);
            int x=s.executeUpdate("update emp102 set name= 'rabari111' where pass ='rabri234'");
            ResultSet result1 =s.executeQuery("select * from emp102 where pass = 'rabar234'");

            while(result1.next()){
                System.out.println("id "+result1.getString(1));
                System.out.println("pass "+result1.getString(2));
            }
            c.rollback();;
            System.out.println("After roolback ");
            ResultSet result2 =s.executeQuery("select * from emp102 where pass='rabari1' ");

            while(result2.next()){
            System.out.println("id: "+result2.getString(1));
            System.out.println("name"+result2.getString(2));

            }
            c.commit();

        } catch (Exception e) {
            System.out.println(e);
          
        }
        System.out.println("Transaction Done");
    }
}
