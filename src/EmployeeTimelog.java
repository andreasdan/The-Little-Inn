public class EmployeeTimeLog {
	private int id;
	private DateTime time;
	private Employee employee;
	private TimeLogType logType;

	public DateTime getTime() {
		return this.time;
	}

	public void setTime(DateTime time) {
		this.timein = time;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public EmployeeTimeLog(Employee employee) {
		this.employee = employee;
		id = 0;
		time = DateTime.now();
	}

	public TimeLogType getLogType() {
		return this.logType;
	}

	public void setLogType(TimeLogType logType) {
		this.logType = logType;
	}
}