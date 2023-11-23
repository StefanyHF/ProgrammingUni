package assignments.assignment_1;

//Assignment 1.2

public class BestBikeMinimumStock {

	public static void main(String[]args){

		int weekConsumption = 400;
		int deliveryTime = 2;

		int minimumStockLevel = calculateWheelsMinimumStockLevel(weekConsumption, deliveryTime);

		System.out.print(minimumStockLevel);

	}

	public static int calculateWheelsMinimumStockLevel(int weekConsumption, int deliveryTime) {
		return weekConsumption * deliveryTime;
	}
}
