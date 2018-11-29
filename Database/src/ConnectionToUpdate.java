import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionToUpdate {

	
public static void main (String[] args) throws ClassNotFoundException {
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String connectionurl = "jdbc:sqlserver://localhost:1433;" + "database=master;user=jdbc;password=abc;";

		try (Connection con = DriverManager.getConnection(connectionurl); Statement stmt = con.createStatement();){
			String update = "update Student " +
					" " +
					" values ()";//!!!!Fill this up with data!
			stmt.executeUpdate(update);
			System.out.println("Update Complete");
			con.close();
		}
		catch(SQLException e) {
			System.out.println("Update Not Completed");
			e.printStackTrace();
		}
	}
}
