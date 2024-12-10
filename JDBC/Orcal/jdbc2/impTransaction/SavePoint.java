
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Savepoint;
import java.sql.Statement;

class SavePoint{
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mca6");
            Statement s = c.createStatement();

            c.setAutoCommit(false);
            int x=s.executeUpdate("update emp102 set name= 'messa' where pass ='rabri234'");
            s.executeUpdate("insert into emp102 values('dhoni2021','dhoni2021')");

            Savepoint savept =c.setSavepoint("aaa");
            int x1=s.executeUpdate("delete from emp102 where pass ='jaddu'");
            s.executeUpdate("insert into emp102 values('pappu','rahul')");
            c.rollback();
      //c.releaseSavepoint(savept);

            c.commit();
            ResultSet result1 = s.executeQuery("select * from emp102");
            while(result1.next()){
                System.out.println("id :"+result1.getString(1));
                System.out.println("name :"+result1.getString(2));
            }
        } catch (Exception e) {
            System.out.println(e);
          
        }
    }
}
