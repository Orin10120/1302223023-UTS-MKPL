package lib;

public class EmployeeSalary extends Employee  {

    //data EmployeeSalary
    private int monthlySalary;
	private int otherMonthlyIncome;
    private int annualDeductible;


    public EmployeeSalary(Employee employee) {
        super(employee.getEmployeeId(), employee.getFirstName(), employee.getLastName(),employee.getAddress(), employee.getIsForeigner(), employee.getGender());
    }

    //Fungsi untuk menentukan gaji bulanan pegawai berdasarkan grade kepegawaiannya
    public void setMonthlySalary(int grade) {	
		if (grade == 1) {
			monthlySalary = 3000000;
            EmployeeSalaryIncome(monthlySalary);
			
		}else if (grade == 2) {
			monthlySalary = 5000000;
            EmployeeSalaryIncome(monthlySalary);
			
		}else if (grade == 3) {
			monthlySalary = 7000000;
            EmployeeSalaryIncome(monthlySalary);
		}
	}

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public void EmployeeSalaryIncome(int monthlySalary){
        if (super.getIsForeigner()) {
            monthlySalary = (int) (monthlySalary + (monthlySalary * 1.5));
        }
    }

    public void setAnnualDeductible(int deductible) {	
		this.annualDeductible = deductible;
	}
	
	public void setAdditionalIncome(int income) {	
		this.otherMonthlyIncome = income;
	}

    public int AnnualDeductible() {
        return annualDeductible;
    } 
    
    public int AdditionalIncome() {
        return otherMonthlyIncome;
    }

    public int getOtherMonthlyIncome() {
        return otherMonthlyIncome;
    }

    public int getAnnualDeductible() {
        return annualDeductible;
    }

}
