package assignments.assignment_2;

import prog1Tools.IOTools;

// Assignment 2.2

public class StockInfoCase {
	public static void main(String[] args) {

		StockInfoCase stockInfoCase = new StockInfoCase();
		stockInfoCase.start(stockInfoCase);

	}

	// used private modifier for these functions as they are intended for use only within this class

	private String getComponentName(int componentNumber) {
		switch(componentNumber) {
		case 1:
			return "Wheel(s)";
		case 2:
			return "Handlebar(s)";
		case 3:
			return "Saddle(s)";
		default: 
			throw new IllegalArgumentException("Invalid Input. Please try again with a valid input."); // with invalid input, the program should stop and throw exception
		}
	}


	private int getInput(String message) {
		System.out.print(message);
		return IOTools.readInt();
	}


	private double calculateMinimumStockLevel(int weeklyConsumption, int deliveryTime, int componentNumber) {
		double securityFactor;

		switch(componentNumber) {
		case 2:
			securityFactor = 0.5;
			break;
		case 3:
			securityFactor = 0.2;
			break;
		default:
			securityFactor = 0.0;
			break;
		}
		return Math.ceil(weeklyConsumption * deliveryTime * (1 + securityFactor)); // used Math.ceil to round double number to the next whole number
	}

	private void displayResult(double minimumStock, String componentName) {
		System.out.print("Miminal number of " + componentName + " in stock: " + minimumStock);
	}

	//created start function to organize the program steps

	private void start(StockInfoCase stockInfoCase) {
		int componentNumber = stockInfoCase.getInput("Please specify the ID for the type of the component:\nWheel: 1\n"
				+ "Handlebar: 2\n"
				+ "Saddle: 3\n ");
		String componentName = stockInfoCase.getComponentName(componentNumber);
		int weeklyConsumption = stockInfoCase.getInput(componentName + " Consumption per Week : ");
		int deliveryTime = stockInfoCase.getInput(componentName + " Delivery Time : ");
		double minimumStock = stockInfoCase.calculateMinimumStockLevel(weeklyConsumption, deliveryTime, componentNumber);
		stockInfoCase.displayResult(minimumStock, componentName);	
	}
}
