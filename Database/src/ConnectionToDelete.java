import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionToDelete {

	
public static void main (String[] args) throws ClassNotFoundException {
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String connectionurl = "jdbc:sqlserver://localhost:1433;" + "database=master;user=jdbc;password=abc;";

		try (Connection con = DriverManager.getConnection(connectionurl); Statement stmt = con.createStatement();){
			String delete = "Delete from Student where LastName='David'";//!!!!Fill this up with data!
			stmt.executeUpdate(delete);
			System.out.println("Delete Successful");
			con.close();
		}
		catch(SQLException e) {
			System.out.println("Insert Not Successful");
			e.printStackTrace();
		}
	}
}
