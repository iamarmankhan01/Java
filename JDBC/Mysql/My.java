import java.sql.*;
public class My{
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/comany";
        String username = "root";
        String password = "root";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection c = DriverManager.getConnection(url, username, password)) {
                try (Statement s = c.createStatement()) {
                    // Create table if not exists
                    s.executeUpdate("CREATE TABLE IF NOT EXISTS emp162 (name VARCHAR(30), salary INT)");
                }
                
                // Insert data
                String t1 = "ARAMN";
                int t2 = 321;
                try (PreparedStatement ps = c.prepareStatement("INSERT INTO emp162 VALUES (?, ?)")) {
                    ps.setString(1, t1);
                    ps.setInt(2, t2);
                    ps.executeUpdate();
                }
                
                // Query data
                try (PreparedStatement ps = c.prepareStatement("SELECT * FROM emp162 WHERE salary = ?")) {
                    ps.setInt(1, t2);
                    try (ResultSet result1 = ps.executeQuery()) {
                        while (result1.next()) {
                            System.out.println("Name: " + result1.getString("name"));
                            System.out.println("Salary: " + result1.getInt("salary"));
                        }
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found.");
        }
    }
}
