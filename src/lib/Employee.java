package lib;


public class Employee {

	private String employeeId;
	private String firstName;
	private String lastName;
	private String idNumber;
	private String address;
	
	public enum gender{male, female};

	public Employee(String employeeId, String firstName, String lastName, String idNumber, String address) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.address = address;

	}
	
}
