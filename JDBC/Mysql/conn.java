import java.sql.*;
public class conn {
    public static void main(String[] args) {
        try {
            //load the driver 
            Class.forName("com.mysql.jdbc.Driver"); 
            String url = "jdbc:mysql://localhost:3036/clg";
            String user = "root";
            String pass = "root";
            Connection connection = DriverManager.getConnection(url,user, pass);
            if(connection.isClosed()){
                System.out.println("Connection is closed");
            }else{
                System.out.println("Connection Create");
            }



        } catch (Exception e) {
           e.printStackTrace();
        }
        
    }
}
