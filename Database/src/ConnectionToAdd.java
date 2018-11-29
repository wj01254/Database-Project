import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ConnectionToAdd {

public static void main (String[] args) throws ClassNotFoundException {
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String connectionurl = "jdbc:sqlserver://localhost:1433;" + "database=master;user=jdbc;password=abc;";

		try (Connection con = DriverManager.getConnection(connectionurl); Statement stmt = con.createStatement();){
			String insert = "Insert into Student " +
					" (StudentID, FirstName, LastName, Year, School, DOB, Address)" +
					" values (900935386, 'Jacques', 'David', 'Freshman', 'GSU', 2001/05/16, 'LOL')";//!!!!Fill this up with data!
			stmt.executeUpdate(insert);
			System.out.println("Insert Complete");
			con.close();
		}
		catch(SQLException e) {
			System.out.println("Insert Not Completed");
			e.printStackTrace();
		}
	}

}
