package MavenProject.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity                                                //database
@Table(name="student_data")                            // This will change the table name from Student to student_data
public class Student {
	
	@Id  
	//@GeneratedValue(strategy=Genera)
	private int id;
	
	private String fname;
	
	private String lname;
	
	@Column(name="contact")                           // this will change column name
	private long mobileNumber;
	
	private String city;
	
	private String gender;

	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}

	

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", fname=" + fname + ", lname=" + lname + ", mobileNumber=" + mobileNumber
				+ ", city=" + city + ", gender=" + gender + "]";
	}
	
	
	
	

}