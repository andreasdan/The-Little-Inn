import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Staff {

	private List<Employee> employees;

	/**
	 * 
	 */
	public Staff() {
		employees = new ArrayList<Employee>();
	}

	/**
	 * 
	 * @param employee
	 */
	public void add(Employee employee) {
		int highId = 0;
		try {
			highId = employees.get(employees.size()-1).getId();
		} catch(Exception e) {

		}
		
		employee.setId(highId+1);
		employees.add(employee);
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
			if(employee.getId() == emp.getId()
				|| employee.getFirstName().equals(emp.getFirstName())
				|| employee.getLastName().equals(emp.getLastName())
				|| employee.getEmployeeType() == emp.getEmployeeType()) {
				out.add(emp);
			}
		}
		return out;
	}

	/**
	 * 
	 * @param employee
	 */
	public void remove(Employee employee) {
		Iterator<Employee> it = employees.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			if(employee.getId() == emp.getId()) {
				it.remove();
			}
		}
	}
}