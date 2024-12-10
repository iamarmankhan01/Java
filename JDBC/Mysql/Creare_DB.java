
import java.sql.*;

public class Creare_DB {
    public static void main(String[] args) {
        try {
            String url ="jdbc:mysql://localhost:3306/";

            String databasesName = "DbNew3";

            String userName ="root";
            String password ="root";

            Connection connection = DriverManager.getConnection(url,userName,password);
            String sql = "Create Database "+databasesName;
            Statement statement =connection.createStatement();
            statement.executeUpdate(sql);
            statement.close();
            System.out.println("DataBase Create Successful");
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
