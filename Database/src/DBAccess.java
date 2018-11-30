import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBAccess {

	String connectionurl = "jdbc:sqlserver://localhost:1433;" + "database=master;user=jdbc;password=abc;";
	Connection con;

	private ResultSet rs;

	public DBAccess() {
		this.Connect();
	}

	public int Connect() {
		try {
			con = DriverManager.getConnection(connectionurl);
			Statement stmt = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
			return 1;
		}
		return 0;
	}

	public ResultSet Read(String s) {
		try {
			rs = con.createStatement().executeQuery(s);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	public void Write(String s) {
		try {
			rs = con.createStatement().executeQuery(s);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}