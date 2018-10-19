public class EmployeeTimelogEntry {

	private Employee employee;
	private DateTime in;
	private DateTime out;

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public DateTime getIn() {
		return this.in;
	}

	public void setIn(DateTime in) {
		this.in = in;
	}

	public DateTime getOut() {
		return this.out;
	}

	public void setOut(DateTime out) {
		this.out = out;
	}

	public EmployeeTimelogEntry() {
		// TODO - implement EmployeeTimelogEntry.EmployeeTimelogEntry
		throw new UnsupportedOperationException();
	}

}