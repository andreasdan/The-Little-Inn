import java.time.LocalDateTime;

public class WorkSession {

	private int id;
	private LocalDateTime from;
	private LocalDateTime to;
	private Employee employee;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getFrom() {
		return this.from;
	}

	public void setFrom(LocalDateTime from) {
		this.from = from;
	}

	public LocalDateTime getTo() {
		return this.to;
	}

	public void setTo(LocalDateTime to) {
		this.to = to;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	/**
	 * 
	 */
	public WorkSession() {
		employee = new Employee();
		id = 0;
		from = LocalDateTime.now();
		to = LocalDateTime.now();
	}

	/**
	 * 
	 * @param employee
	 */
	public WorkSession(int id, Employee employee, LocalDateTime from, LocalDateTime to) {
		this.employee = employee;
		this.id = id;
		this.from = from;
		this.to = to;
	}
}