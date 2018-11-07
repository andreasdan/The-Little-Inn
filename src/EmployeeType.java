public enum EmployeeType {
	SUPERVISOR("Supervisor"), // 0x01
	RECEPTIONIST("Receptionist"),
	SERVANT("Servant"),
	CHEF("Chef");

	final private String name;

	EmployeeType(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	
	public boolean equals(EmployeeType e) {
		return name.equals(e.toString());
	}
}