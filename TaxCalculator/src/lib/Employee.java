package lib;

import java.util.LinkedList;
import java.util.List;

public class Employee {

	private String employeeId;
	private String firstName;
	private String lastName;
	private String idNumber;
	private String address;
	private Boolean isForeigner;
	
	
	public enum Gender { 
		laki_laki,
		perempuan
	}
	private Gender gender;
	public List<SetChild> children;

	public Employee(String employeeId, String firstName, String lastName, String idNumber, String address, Boolean isForeigner, Gender gender) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.address = address;
		this.isForeigner = isForeigner;
		this.gender = gender;

		children = new LinkedList<SetChild>();
	}

	public Employee(String employeeId2String, String firstName2String, String lastName2String, String address2String, Boolean isForeigner2Boolean, Gender gender2Gender) {	
	}


	public Gender getGender() {
		return gender;
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

	public int getChildrenCount() {
		return children.size();
	}

	public void addChild(String childName, String childIdNumber) {
		children.add(new SetChild(childName, childIdNumber));
	}

}
