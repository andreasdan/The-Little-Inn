public enum TimeLogType {
	IN("In"),
	OUT("Out");

	final private String name;

	TimeLogType(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	public boolean equals(TimeLogType e) {
		return name.equals(e.toString());
	}
}