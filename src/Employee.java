public class Employee {

	private int id;
	private String firstName;
	private String lastName;
	private EmployeeType employeeType;
	private int phone;
	private String email;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public EmployeeType getEmployeeType() {
		return this.employeeType;
	}

	public void setEmployeeType(EmployeeType employeeType) {
		this.employeeType = employeeType;
	}

	/**
	 * 
	 * @param employeeType
	 */
	public Employee(EmployeeType employeeType) {
		id = 0;
		firstName = "";
		lastName = "";
		employeeType = EmployeeType.CHEF;
	}

	public int getPhone() {
		return this.phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}