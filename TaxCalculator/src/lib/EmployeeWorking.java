package lib;

import java.time.LocalDate;

public class EmployeeWorking extends Employee {

    //data EmployeeWorking
    private int yearJoined;
	private int monthJoined;
	private int monthWorkingInYear;
    EmployeeSalary employeeSalary;
    EmployeeSpouse employeeSpouse;

    public EmployeeWorking(Employee employee, EmployeeSalary employeeSalary, EmployeeSpouse employeeSpouse, int yearJoined, int monthJoined, int monthWorkingInYear) {
        super(employee.getEmployeeId(), employee.getFirstName(), employee.getLastName(), employee.getAddress(), employee.getIsForeigner(), employee.getGender());

        this.yearJoined = yearJoined;
        this.monthJoined = monthJoined;
        this.monthWorkingInYear = monthWorkingInYear ;
    }


    //Fungsi untuk menghitung berapa lama pegawai bekerja dalam setahun ini
    public int getAnnualIncomeTax() {

        LocalDate date = LocalDate.now();

        if (date.getYear() == yearJoined) {
            monthWorkingInYear = date.getMonthValue() - monthJoined;
        } else {
            monthWorkingInYear = 12;
        }

        return TaxFunction.calculateTax(employeeSalary, employeeSpouse, monthWorkingInYear, employeeSpouse.getSpouseIdNumber().equals(""), super.getChildrenCount());

    }

}
