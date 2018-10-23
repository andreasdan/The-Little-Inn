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

	public String getEmployeeTypeAsString() {
		switch(getEmployeeType()) {
			case SUPERVISOR:
				return "Supervisor";
			case RECEPTIONIST:
				return "Receptionist";
			case CHEF:
				return "Chef";
			default:
				return "Servant";
		}
	}

	public void setEmployeeType(EmployeeType employeeType) {
		this.employeeType = employeeType;
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


	public Employee() {
		id = 0;
		firstName = "";
		lastName = "";
		employeeType = EmployeeType.CHEF;
	}

	/**
	 * 
	 * @param employeeType
	 */
	public Employee(int id, String firstName, String lastName, int phone, String email, EmployeeType employeeType) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.employeeType = employeeType;
	}

	public String toString() {
		return "id: "+ getId() +" \tfirstName: "+ getFirstName() +" \tlastName: "+ getLastName() +" \tphone: "+ getPhone() +" \temail: "+ getEmail() +" \temployeeType: "+ getEmployeeTypeAsString();
	}
}