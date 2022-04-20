package lib;

public class Person extends Employee{
    private String employeeId;
	private String firstName;
	private String lastName;
	private String idNumber;
	private String address;

    public Person(
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void getIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getAddress() {
        return address;
    }

    public void getAddress(String address) {
        this.address = address;
    }
}
