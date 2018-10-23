import java.time.LocalDateTime;

public class Record {

   //private attributes
	private LocalDateTime checkInDate;
	private LocalDateTime checkOutDate;
	private int roomNumber;
	private int customerId;

   //getters and setters to reach attributes
	public LocalDateTime getCheckInDate() {
		return this.checkInDate;
	}

	public void setCheckInDate(LocalDateTime checkInDate) {
		this.checkInDate = checkInDate;
	}

	public LocalDateTime getCheckOutDate() {
		return this.checkOutDate;
	}

	public void setCheckOutDate(LocalDateTime checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public int getRoomNumber() {
		return this.roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomer(int customerId) {
		this.customerId = customerId;
	}

   //record constructor must take all attributes as parameters
	public Record(LocalDateTime checkInDate, LocalDateTime checkOutDate, int roomNumber, int customerId) {
      this.checkInDate = checkInDate;
      this.checkOutDate = checkOutDate;
      this.roomNumber = roomNumber;
      this.customerId = customerId;
	}
   
   public String toString() //overrides the default toString() method
   {
      return "Check-in date: " + checkInDate
            + " Check-out date: " + checkOutDate
            + " Room nr.: " + roomNumber
            + " Customer ID: " + customerId;
   }

}