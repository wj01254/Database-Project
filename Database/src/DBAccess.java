import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBAccess {

	public static void main (String[] args) throws ClassNotFoundException {
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String connectionurl = "jdbc:sqlserver://localhost:1433;" + "database=master;user=jdbc;password=abc;";

		try (Connection con = DriverManager.getConnection(connectionurl); Statement stmt = con.createStatement();){
			String SQL = "select* from Student";
			ResultSet rs = stmt.executeQuery(SQL);

//			while (rs.next()) {
//				System.out.println(rs.getInt("StudentID") + "\t " +rs.getString("FirstName") + "\t" + rs.getString("LastName") + "\t" + rs.getString("Year")
//				+ "\t" + rs.getString("School") + "\t" + rs.getDate("DOB") + "\t" + rs.getString("Address"));				
//			}
			con.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}



	}

	//	public static Connection getDataBaseConnection() throws SQLException {
	//
	//        try {
	//            //Class.forName("com.mysql.jdbc.Driver");
	//        	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	//        
	//        } catch (ClassNotFoundException ex) {
	//            System.out.println("driver not found" + ex);
	//        }
	//        
	//        System.out.println("Stuck?");
	//       	
	//        	
	//        	 return  con;
	//        
	//    }
}