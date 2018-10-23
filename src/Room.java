public class Room {

   //private attributes
	private int beds;
	private int roomNumber;
	private double sizeInSquareMeters;
	private boolean isAvailable;
	private double pricePerNight;

   //getters and setters to reach private attributes
	public int getBeds() {
		return this.beds;
	}

	public void setBeds(int beds) {
		this.beds = beds;
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

	public boolean isAvailable() {
		return this.isAvailable;
	}

	public void setIsAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public double getPricePerNight() {
		return this.pricePerNight;
	}

	public void setPricePerNight(double pricePerNight) {
		this.pricePerNight = pricePerNight;
	}

   //default constructor
	public Room() {
      this.roomNumber = 0;
      this.beds = 0;
      this.sizeInSquareMeters = 0.0;
      this.isAvailable = false;
      this.pricePerNight = 0.0;
	}
   
   //constructor that takes all attributes as parameters
   public Room(int roomNumber, int beds, double sizeInSquareMeters, boolean isAvailable, double pricePerNight) {
      this.roomNumber = roomNumber;
      this.beds = beds;
      this.sizeInSquareMeters = sizeInSquareMeters;
      this.isAvailable = isAvailable;
      this.pricePerNight = pricePerNight;
	}
   
   public String toString() //overrides the default toString() method
   {
      return "Room nr.: " + roomNumber
            + " Beds: " + beds
            + " Size: " + sizeInSquareMeters + "m2"
            + " Is available: " + isAvailable
            + " Price per night: " + pricePerNight;
   }

}