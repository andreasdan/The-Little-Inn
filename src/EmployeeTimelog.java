import java.time.LocalDateTime;

public class EmployeeTimeLog {
	private int id;
	private LocalDateTime time;
	private Employee employee;
	private TimeLogType logType;

	public LocalDateTime getTime() {
		return this.time;
	}

	public void setTime(LocalDateTime time) {
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
		time = new LocalDateTime();
	}

	public TimeLogType getLogType() {
		return this.logType;
	}

	public void setLogType(TimeLogType logType) {
		this.logType = logType;
	}
}