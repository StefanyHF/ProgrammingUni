package assignments.assignment_1;

import prog1Tools.IOTools;

// Assignment 1.4

public class BestBikeMinimumStock_ {

	public static void main (String[] args) {

		System.out.print("Insert the wheels weekly consumption: ");
		int weeklyConsumption = IOTools.readInt();

		System.out.print("Insert the delivery time: ");
		int deliveryTime = IOTools.readInt();

		int minimumStockLevel = BestBikeMinimumStock.calculateWheelsMinimumStockLevel(weeklyConsumption, deliveryTime);

		System.out.println("The minimum wheels stock level is " + minimumStockLevel);
	}
}
