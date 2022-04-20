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
	
	public Employee(boolean isForeigner, Gender gender) {
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
