package assignments.assignment_4;

import prog1Tools.IOTools;

//Assignment 4.2 and 5.4

public class Component {
	int componentID;
	String name;
	String deliveryDate;
	int stockAmount;
	String vendor;
	String comment;

	public Component(int componentID) {
		this.componentID = componentID;
	}

	public void printComponent() {
		System.out.println("Component ID: " + componentID);
		System.out.println("Name: " + name);
		System.out.println("Delivery Date: " + deliveryDate);
		System.out.println("Stock Amount: " + stockAmount);
		System.out.println("Vendor: " + vendor);
		System.out.println("Comment: " + comment);
	}

	public static void writeComponent(Component[] components) {
		System.out.print(String.format("Enter Component ID (0 - %d): ", components.length-1));
		int componentID = IOTools.readInt();
		if (componentID >= 0 && componentID < components.length) {
			Component component = components[componentID];

			System.out.print("Name: ");
			component.name = IOTools.readString();

			System.out.print("Delivery Date: ");
			component.deliveryDate = IOTools.readString();

			System.out.print("Stock Amount: ");
			component.stockAmount = IOTools.readInt();

			System.out.print("Vendor: ");
			component.vendor = IOTools.readString();

			System.out.print("Comment: ");
			component.comment = IOTools.readString();

			System.out.println("Component information entered successfully.");
		} else {
			System.out.println(String.format("Invalid Component ID. Please enter a valid ID (1 - %d).",components.length));
		}
	}

}
