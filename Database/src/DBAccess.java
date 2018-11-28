import java.sql.*;


public class DBAccess {
	
	public static void main (String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String connectionurl = "jdbc:mysql://localhost:3306;" + "databaseName=master;" + "user=MyUserName;password=**;"; 
			Connection con = DriverManager.getConnection(connectionurl);
			//2. Create a statement
			Statement myStmt = con.createStatement();
			//3. Execute SQL query
			ResultSet myRs = myStmt.executeQuery("select * from Student");
			//4. Process the result set
			while (myRs.next()) {
				System.out.println(myRs.getString("First Name") + ", " + 
			myRs.getString("Last Name") + ", " + myRs.getInt("Year") + ", " + myRs.getString("School") 
			+ ", " + myRs.getInt("DOB") + ", " + myRs.getString("Address"));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	

	public static Connection getDataBaseConnection() throws SQLException {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Statement state = connection.createStatement();
        } catch (ClassNotFoundException ex) {
            System.out.println("driver not found" + ex);
        }
        Connection connection = null;
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/master", "DESKTOP-HFN08GM\\wende" , "");
        System.out.println("Stuck?");
        return  connection;
        
        
    }

}
