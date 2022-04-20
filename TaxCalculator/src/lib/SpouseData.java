package lib;

public class SpouseData extends Employee{
    private String spouseName;
	private String spouseIdNumber;

    public SpouseData(
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

    public void setSpouse(String spouseName) {
		this.spouseName = spouseName;
	}

    public void setSpouseId(String spouseIdNumber) {
        this.spouseIdNumber = spouseIdNumber;
    }

    public String getSpouseName() {
        return spouseName;
    }

    public String getSpouseIdNumber() {
        return spouseIdNumber;
    }
}