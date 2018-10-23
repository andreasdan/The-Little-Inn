public class WorkSession {

	private int id;
	private DateTime from;
	private DateTime to;
	private Employee employee;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public DateTime getFrom() {
		return this.from;
	}

	public void setFrom(DateTime from) {
		this.from = from;
	}

	public DateTime getTo() {
		return this.to;
	}

	public void setTo(DateTime to) {
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
	 * @param employee
	 */
	public WorkSession(Employee employee) {
		this.employee = employee;
		id = 0;
		from = DateTime.now();
		to = DateTime.now();
	}

}