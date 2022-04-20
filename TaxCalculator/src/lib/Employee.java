package lib;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class Employee {

	public  enum Gender {
		laki_laki,
		perempuan,
	}
	private boolean isForeigner;
	private Gender gender; //true = Laki-laki, false = Perempuan

	private List<ChildData> childrens;
	
	public Employee(String employeeId, String firstName, String lastName, String idNumber, String address, int yearJoined, int monthJoined, int dayJoined, boolean isForeigner, boolean gender) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.address = address;
		this.yearJoined = yearJoined;
		this.monthJoined = monthJoined;
		this.dayJoined = dayJoined;
		this.isForeigner = isForeigner;
		this.gender = gender;
		
		childrens = new LinkedList<ChildData>();
	}

	public boolean isForeigner() {
		return isForeigner;
	}
	
	public int getTotalChildrens(){
		return childrens.size();
	}
	
	public void addChild(String childName, String childIdNumber) {
		childNames.add(childName);
		childIdNumbers.add(childIdNumber);
	}
}
