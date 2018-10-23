public class Customer {

	private int id;
	private String firstName;
	private String lastName;
	private int phone;
	private String email;
	private String address;
	private int zipCode;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPhone() {
		return this.phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
   
   public Customer() {
      this.id = -1;
      this.firstName = "";
      this.lastName = "";
      this.phone = 0;
      this.email = "";
      this.address = "";
      this.zipCode = 0;
   }

	public Customer(int id, String firstName, String lastName, int phone, String email, String address, int zipCode) {
		this.id = id;
      this.firstName = firstName;
      this.lastName = lastName;
      this.phone = phone;
      this.email = email;
      this.address = address;
      this.zipCode = zipCode;
	}
   
   public String toString()
   {
      return "ID: " + id
            + " Firstname: " + firstName
            + " Lastname: " + lastName
            + " Phone nr.: " + phone
            + " Email: " + email
            + " Address: " + address
            + " Zip code: " + zipCode;
   }

}