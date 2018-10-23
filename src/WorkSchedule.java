public class WorkSchedule {

	private List<WorkSession> sessions;

	public WorkSchedule() {
		sessions = new ArrayList<WorkSession>();
	}

	/**
	 * 
	 * @param session
	 */
	public boolean add(WorkSession session) {
		int highId = 0;
		for(WorkSession sess : sessions)
		{
			highId = sess.getId() > highId ? sess.getId() : highId;
			if(session.getId() == sess.getId()) {
				return false;
			}
		}
		session.setId(highId+1);
		session.add(session);
	}

	/**
	 * 
	 * @param id
	 */
	public WorkSession get(int id) {
		WorkSession out = null;
		for(WorkSession session : sessions)
		{
			if(session.getId() == id) {
				out = session;
				break;
			}
		}
		return out;
	}

	public List<WorkSession> list() {
		return new ArrayList<WorkSession>(sessions);
	}

	/**
	 * 
	 * @param session
	 */
	public List<WorkSession> find(WorkSession session) {
		List<WorkSession> out = new ArrayList<WorkSession>();
		for(WorkSession sess : sessions)
		{
			if(session.getId() == sess.getId()
				|| session.getEmployee().getFirstName().equals(sess.getEmployee().getFirstName())
				|| session.getEmployee().getLastName().equals(sess.getEmployee().getLastName())
				|| session.getEmployee().getEmployeeType() == sess.getEmployee().getEmployeeType()) {
				out.add(sess);
			}
		}
		return out;
	}

	/**
	 * 
	 * @param session
	 */
	public List<WorkSession> remove(WorkSession session) {
		Iterator<WorkSession> it = sessions.iterator();
		while(it.hasNext()) {
			WorkSession sess = it.next();
			if(session.getId() == sess.getId()) {
				it.remove();
			}
		}
	}

}