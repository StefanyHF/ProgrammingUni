package assignments.assignment_4;

// Assignment 4.1

public class BestBikeCustomers {
	public static void main(String[] args) {
		Customer customer1 = new Customer(1,"Mike", "Becker", 25, "Augsburg", "12784", 
				"Augsburg Street", "34567878034", "email@email.com");

		Customer customer2 = new Customer(2,"Erin", "Bernard", 27, "Berlin", "10327", 
				"Berlin Street", "5274290709", "email2@email.com");

		System.out.println(customer1); // this will print the custom string representation
		System.out.println();
		System.out.println(customer2);
	}
}


