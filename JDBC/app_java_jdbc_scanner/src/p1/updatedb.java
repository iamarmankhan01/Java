package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class updatedb {

	public static void main(String[] args) {
		try {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("-----Update Record----:");
			
			System.out.println("Enter the Email :");
			String email = sc.next();
			
			System.out.println("New Number:");
			String number=sc.next();
			
			// Connect to database - use psaDB (SQL)
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/julydb", "root", "root");
			System.out.println(con);
		
			// Write & execute SQl query
			Statement stmt = con.createStatement();
			stmt.executeUpdate("Update student set mobile='"+number+"' where email='"+email+"'");

			// Close database connection
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
