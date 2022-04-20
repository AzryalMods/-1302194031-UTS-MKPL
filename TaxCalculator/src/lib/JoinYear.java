package lib;

import java.time.LocalDate;

public class JoinYear extends Employee{
    private int yearJoined;
	private int monthJoined;
	private int dayJoined;
	private int monthWorkingInYear;

    public JoinYear(
        String employeeId, 
        String firstName, 
        String lastName, 
        String idNumber, 
        String address, 
        int yearJoined,
        int monthJoined, 
        int dayJoined, 
        boolean isForeigner, 
        boolean gender
    ) {
    super(
        employeeId, 
        firstName, 
        lastName, 
        idNumber, 
        address, 
        yearJoined,
        monthJoined, 
        dayJoined, 
        isForeigner, 
        gender);
    }

    public int getDayJoined() {
        return dayJoined;
    }

    public int getAnnualIncomeTax() {
		
		//Menghitung berapa lama pegawai bekerja dalam setahun ini, jika pegawai sudah bekerja dari tahun sebelumnya maka otomatis dianggap 12 bulan.
		LocalDate date = LocalDate.now();
		
		if (date.getYear() == yearJoined) {
			monthWorkingInYear = date.getMonthValue() - monthJoined;
		}else {
			monthWorkingInYear = 12;
		}
		
		return TaxFunction.calculateTax(monthlySalary, otherMonthlyIncome, monthWorkingInYear, annualDeductible, spouseIdNumber.equals(""), childIdNumbers.size());
	}
}