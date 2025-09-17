package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class insertdb {

	public static void main(String[] args) {
	
				
		
		try {
			
			System.out.println("-----Insert Record----:");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Name :");
			String name=sc.next();
			System.out.println("Enter the Email :");
			String email = sc.next();
			System.out.println("Enter the Number:");
			String number=sc.next();
			
			
			// Connect to database - use psaDB (SQL)
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/julydb", "root", "root");
			System.out.println(con);
			System.out.println("Connect DB");
			// Write & execute SQl query
			Statement stmt = con.createStatement();
			stmt.executeUpdate("insert into student values('"+name+"','"+email+"','"+number+"')");
			System.out.println(stmt);
			// Close database connection
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
