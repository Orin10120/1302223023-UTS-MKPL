package lib;



public class EmployeeSpouse extends Employee {
    
    //data EmployeeSpouse
    private String spouseName;
	private String spouseIdNumber;
    private Boolean IsMarried;
    

    public EmployeeSpouse(Employee employee, String spouseName, String spouseIdNumber) {
        super(employee.getEmployeeId(), employee.getFirstName(), employee.getLastName(), employee.getAddress(), employee.getIsForeigner(), employee.getGender());

        this.spouseName = spouseName;
        this.spouseIdNumber = spouseIdNumber;
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

    public Boolean getIsMarried() {
        return IsMarried;
    }

}
