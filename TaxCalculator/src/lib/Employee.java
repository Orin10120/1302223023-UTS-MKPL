package lib;

public class Employee {

	private String employeeId;
	private String firstName;
	private String lastName;
	private String idNumber;
	private String address;
	private Boolean isForeigner;
	private Boolean gender; ////true = Laki-laki, false = Perempuan
	

	public Employee(String employeeId, String firstName, String lastName, String idNumber, String address, Boolean isForeigner) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.address = address;
		this.isForeigner = isForeigner;
	}

	public Employee(String employeeId2String, String firstName2String, String lastName2String, String address2String, Boolean isForeigner2Boolean) {
		
	}


	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Boolean getIsForeigner() {
		return isForeigner;
	}

	public void setIsForeigner(Boolean isForeigner) {
		this.isForeigner = isForeigner;
	}

}
