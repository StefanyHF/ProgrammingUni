package assignments.assignment_4;

// Assignment 4.1

public class Customer  {
	private int customerID;
	private String name;
	private String surname;
	private int age;
	private String city;
	private String postalCode;
	private String street;
	private String phone;
	private String email;


	public Customer(int customerID, String name, String surname, 
			int age, String city, String postalCode, 
			String street, String phone, String email) {
		this.customerID = customerID;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.city = city;
		this.postalCode = postalCode;
		this.street = street;
		this.phone = phone;
		this.email = email;
	}

	public int getCustomerID() {
		return customerID;
	}


	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer ID: " + customerID + "\n" +
				"Name: " + name + "\n" +
				"Surname: " + surname + "\n" +
				"Age: " + age + "\n" +
				"City: " + city + "\n" +
				"Postal Code: " + postalCode + "\n" +
				"Street: " + street + "\n" +
				"Phone: " + phone + "\n" +
				"E-Mail: " + email;
	}
}

