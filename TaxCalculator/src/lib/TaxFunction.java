package lib;

public class TaxFunction {

	/**
	 * Fungsi untuk menghitung jumlah pajak penghasilan pegawai yang harus dibayarkan setahun.
	 */
	
	public static int calculateTax(EmployeeSalary salary, EmployeeSpouse spouse, int numberOfChildren, boolean b, int numberOfMonthWorking) {
		int tax = 0;

		if (numberOfMonthWorking > 12) {
			System.err.println("More than 12 month working per year");
		}
		
		if (numberOfChildren > 3) {
			numberOfChildren = 3;
		}
		
		if (spouse.getIsMarried()) {
			tax = (int) Math.round(0.05 * (((salary.getMonthlySalary() + salary.getOtherMonthlyIncome()) * numberOfMonthWorking) - salary.getAnnualDeductible() - (54000000 + 4500000 + (numberOfChildren * 1500000))));
		}else {
			tax = (int) Math.round(0.05 * (((salary.getMonthlySalary() + salary.getOtherMonthlyIncome()) * numberOfMonthWorking) - salary.getAnnualDeductible() - 54000000));
		}
		
		if (tax < 0) {
			return 0;
		}else {
			return tax;
		}
		
			 
	}
	
}
