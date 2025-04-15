package lib;

import java.util.LinkedList;
import java.util.List;

public class EmployeeSpouse extends Employee {
    
    private String spouseName;
	private String spouseIdNumber;
    private List<String> childNames;
	private List<String> childIdNumbers;

    public EmployeeSpouse(Employee employee) {
        super(employee.getEmployeeId(), employee.getFirstName(), employee.getLastName(), employee.getAddress(), employee.getIsForeigner());

        childNames = new LinkedList<String>();
		childIdNumbers = new LinkedList<String>();
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    public String getSpouseIdNumber() {
        return spouseIdNumber;
    }

    public void setSpouseIdNumber(String spouseIdNumber) {
        this.spouseIdNumber = super.getEmployeeId();
    }

    public void addChild(String childName, String childIdNumber) {
        childNames.add(childName);
        childIdNumbers.add(childIdNumber);
    }

}
