public class Room {

	private int id;
	private int bedrooms;
	private int roomNumber;
	private double sizeInSquareMeters;
	private boolean isAvailable;
	private boolean isReserved;
	private double pricePerNight;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBedrooms() {
		return this.bedrooms;
	}

	public void setBedrooms(int bedrooms) {
		this.bedrooms = bedrooms;
	}

	public int getRoomNumber() {
		return this.roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public double getSizeInSquareMeters() {
		return this.sizeInSquareMeters;
	}

	public void setSizeInSquareMeters(double sizeInSquareMeters) {
		this.sizeInSquareMeters = sizeInSquareMeters;
	}

	public boolean isIsAvailable() {
		return this.isAvailable;
	}

	public void setIsAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public boolean isIsReserved() {
		return this.isReserved;
	}

	public void setIsReserved(boolean isReserved) {
		this.isReserved = isReserved;
	}

	public double getPricePerNight() {
		return this.pricePerNight;
	}

	public void setPricePerNight(double pricePerNight) {
		this.pricePerNight = pricePerNight;
	}

	public Room() {
		// TODO - implement Room.Room
		throw new UnsupportedOperationException();
	}

}