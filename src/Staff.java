public class Staff {

	private List<Employee> employees;
	private TimeLog timeLog;
	private WorkSchedule workSchedule;

	public TimeLog getTimeLog() {
		return this.timeLog;
	}

	public TimeLog getWorkSchedule() {
		return this.workSchedule;
	}

	/**
	 * 
	 * @param svc1
	 */
	public Staff(TimeLog svc1, WorkSchedule svc2) {
		timeLog = svc1;
		workSchedule = svc2;
	}

	/**
	 * 
	 * @param employee
	 */
	public boolean add(Employee employee) {
		int highId = 0;
		for(Employee emp : employees)
		{
			highId = emp.getId() > highId ? emp.getId() : highId;
			if(employee.getId() == emp.getId()) {
				return false;
			}
		}
		employee.setId(highId+1);
		employees.add(session);
	}

	/**
	 * 
	 * @param id
	 */
	public Employee get(int id) {
		Employee out = null;
		for(Employee emp : employees)
		{
			if(emp.getId() == id) {
				out = emp;
				break;
			}
		}
		return out;
	}

	public List<Employee> list() {
		return new ArrayList<Employee>(employees);
	}

	/**
	 * 
	 * @param employee
	 */
	public List<Employee> find(Employee employee) {
		List<Employee> out = new ArrayList<Employee>();
		for(Employee emp : employees)
		{
			if(session.getId() == sess.getId()
				|| session.getFirstName().equals(sess.getFirstName())
				|| session.getLastName().equals(sess.getLastName())
				|| session.getEmployeeType() == sess.getEmployeeType()) {
				out.add(sess);
			}
		}
		return out;
	}

	/**
	 * 
	 * @param employee
	 */
	public Employee remove(Employee employee) {
		Iterator<Employee> it = employees.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			if(employee.getId() == emp.getId()) {
				it.remove();
			}
		}
	}

}