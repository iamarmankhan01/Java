package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class readdb {

	public static void main(String[] args) {
		try {
			// Connect to database - use psaDB (SQL)
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/julydb", "root", "root");
			System.out.println(con);
			System.out.println("Connect DB");
			// Write & execute SQl query
			Statement stmt = con.createStatement();
			ResultSet result = stmt.executeQuery("Select * from student");

			while (result.next()) {
				System.out.print(result.getString(1));
				System.out.print(result.getString(2));
				System.out.print(result.getString(3));
			}

			// Close database connection
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
