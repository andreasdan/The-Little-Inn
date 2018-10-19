public class Record {

	private int id;
	private DateTime checkInDate;
	private DateTime checkOutDate;
	private Room room;
	private Customer customer;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public DateTime getCheckInDate() {
		return this.checkInDate;
	}

	public void setCheckInDate(DateTime checkInDate) {
		this.checkInDate = checkInDate;
	}

	public DateTime getCheckOutDate() {
		return this.checkOutDate;
	}

	public void setCheckOutDate(DateTime checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public Room getRoom() {
		return this.room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Record() {
		// TODO - implement Record.Record
		throw new UnsupportedOperationException();
	}

}