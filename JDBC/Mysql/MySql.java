import java.sql.*;

public class MySql{
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/comany","root","root");
             
            String t1="ARAMN";
            int t2= 321; 

            Statement s= c.createStatement();
            s.executeUpdate("create table emp162 (name varchar(30),salary int )");
            s.close();
            PreparedStatement ps = c.prepareStatement("insert into emp162 va lues (?,?)");
            ps.setString(1,t1);
            ps.setInt(2,t2);
            ps.executeUpdate();
            ps.close();
            ps = c.prepareStatement("select * from emp162 where salary =?");
            ps.setInt(1, t2);

            ResultSet result1=ps.executeQuery();

            while(result1.next()){
                System.out.println("name"+result1.getString(1));
                System.out.println("Salary"+result1.getString(2));
            }   

        } catch (SQLException e) {
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

//photo number 52;