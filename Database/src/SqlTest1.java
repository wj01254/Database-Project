import java.sql.*;


public class SqlTest1 {

	public static void main(String arg[]) throws Exception
	{
//		System.out.println("Update DB");
//		Connection con = null;
//		String url = "jdbc:mysql://localhost:3306/";
//		String db = "master";
//		String driver = "com.mysql.cj.jdbc.Driver";
//		try {
//			Class.forName(driver);
//			con = DriverManager.getConnection(url + db, "", "");
//			try {
//				Statement st = con.createStatement();
//				String sql = "update this dude!!";
//				st.executeUpdate(sql);
//				st.close();
//				System.out.println("Data updated");
//			}
//			catch(SQLException s) {
//				System.out.println("SQL statement is not executed");
//			}
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String connectionUrl = "jdbc:sqlserver://localhost:1433;" +  
		   "database=master; username=jdbc;password=abc;";  
		Connection con = DriverManager.getConnection(connectionUrl);
		con.close();	
		
	}
}
