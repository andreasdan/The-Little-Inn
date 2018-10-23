import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class WorkSchedule {

	private List<WorkSession> sessions;

	public WorkSchedule() {
		sessions = new ArrayList<WorkSession>();
	}

	/**
	 * 
	 * @param session
	 */
	public void add(WorkSession session) {
		int highId = 0;
		try {
			highId = sessions.get(sessions.size()-1).getId();
		} catch(Exception e) {

		}

		session.setId(highId+1);
		sessions.add(session);
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
			if(session.getId() != 0 && session.getId() == sess.getId()
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
	public void remove(WorkSession session) {
		Iterator<WorkSession> it = sessions.iterator();
		while(it.hasNext()) {
			WorkSession sess = it.next();
			if(session.getId() == sess.getId()) {
				it.remove();
			}
		}
	}

}