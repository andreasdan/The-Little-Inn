import java.time.LocalDateTime;

public class TimeLog {

	private List<EmployeeTimeLog> log;

	public TimeLog() {
		log = new ArrayList<EmployeeTimeLog>();
	}

	/**
	 * 
	 * @param employee
	 */
	public void checkIn(Employee employee) {
		EmployeeTimeLog eTimeLog = new EmployeeTimeLog(employee);
		eTimeLog.setTimeLogType(TimeLogType.IN);
		log.add(eTimeLog);
	}

	/**
	 * 
	 * @param employee
	 */
	public void checkOut(Employee employee) {
		EmployeeTimeLog eTimeLog = new EmployeeTimeLog(employee);
		eTimeLog.setTimeLogType(TimeLogType.OUT);
		log.add(eTimeLog);
	}

	public List<EmployeeTimeLog> list() {
		return new ArrayList<EmployeeTimeLog>(log);
	}

	/**
	 * 
	 * @param employee
	 */
	public List<EmployeeTimeLog> list(Employee employee) {
		List<EmployeeTimeLog> out = new ArrayList<EmployeeTimeLog>();
		for(EmployeeTimeLog entry : this.log) {
			if(employee.getId() == entry.getEmployee().getId()) {
				out.add(entry);
			}
		}
		return out;
	}

	/**
	 * 
	 * @param from
	 * @param to
	 */
	public List<EmployeeTimeLog> list(LocalDateTime from, LocalDateTime to) {
		List<EmployeeTimeLog> out = new ArrayList<EmployeeTimeLog>();
		Interval interval = new Interval(from, to);

		for(EmployeeTimeLog entry : this.log) {
			if (interval.contains(entry.getTime())) {
				out.add(entry);
			}
		}
		return out;
	}

	/**
	 * 
	 * @param employee
	 * @param from
	 * @param to
	 */
	public List<EmployeeTimeLog> list(Employee emplyee, LocalDateTime from, LocalDateTime to) {
		List<EmployeeTimeLog> out = new ArrayList<EmployeeTimeLog>();
		Interval interval = new Interval(from, to);

		for(EmployeeTimeLog entry : this.log) {
			if (employee.getId() == entry.getEmployee().getId()
				&& interval.contains(entry.getTime()))
			{
				out.add(entry);
			}
		}
		return out;
	}

}