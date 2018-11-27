import java.sql.Date;

public class Students {
	
//Objects made to hold the values supplied by the database
	private String name;
	private Date dob;
	private int id;
	private String year;
	private String address;
	
	
	public Students(String name, Date dob, int id, String year, String address) {
		super();
		this.name = name;
		this.dob = dob;
		this.id = id;
		this.year = year;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
