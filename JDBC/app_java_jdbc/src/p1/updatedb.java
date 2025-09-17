package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class updatedb {

	public static void main(String[] args) {
		try {
			// Connect to database - use psaDB (SQL)
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/julydb", "root", "root");
			System.out.println(con);
			System.out.println("Connect DB");
			// Write & execute SQl query
			Statement stmt = con.createStatement();
			stmt.executeUpdate("Update student set mobile='9632882052' where email='mike@gmail.com'");

			// Close database connection
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
