package assignments.assignment_3;

import prog1Tools.IOTools;

// Assignment 3.3

public class ComponentInfoArray {
	public static void main(String[] args) {
		double[][][] componentData = new double[5][50][10];
		boolean exitProgram = false;

		while (!exitProgram) {
			System.out.println("****Menu****");
			System.out.println("1 = New Data Entry");
			System.out.println("2 = Print Component Parameters");
			System.out.println("3 = End Program");
			System.out.print("Please select: ");

			int choice = IOTools.readInt();

			switch (choice) {
			case 1:
				newDataEntry(componentData);
				break;
			case 2:
				printComponentParameters(componentData);
				break;
			case 3:
				System.out.println("Program ended.");
				exitProgram = true;
				break;
			default:
				System.out.println("Invalid choice. Please select a valid option.");
			}
		}
	}

	public static void newDataEntry(double[][][] componentData) {
		System.out.print("Which product ID? ");
		int productID = IOTools.readInt();
		System.out.print("Which component ID? ");
		int componentID = IOTools.readInt();
		System.out.print("Which parameter ID? ");
		int parameterID = IOTools.readInt();
		System.out.print("Enter Data Value: ");
		double dataValue = IOTools.readDouble();

		if ((productID >= 0 && productID < 5) && (componentID >= 0 && componentID < 50) && (parameterID >= 0 && parameterID < 10)) {
			componentData[productID][componentID][parameterID] = dataValue;
		} else {
			System.out.println("Invalid product, component, or parameter ID.");
		}
	}

	public static void printComponentParameters(double[][][] componentData) {
		System.out.print("Which product ID? ");
		int productID = IOTools.readInt();
		System.out.print("Which component ID? ");
		int componentID = IOTools.readInt();

		if ((productID >= 0 && productID < 5) && (componentID >= 0 && componentID < 50)) {
			System.out.println("Parameters for Product " + productID + " and component " + componentID);
			for (int i = 0; i < 10; i++) {
				System.out.println("Parameter Nr. " + i + " = " + componentData[productID][componentID][i]);
			}
		} else {
			System.out.println("Invalid product or component ID.");
		}
	}
}
