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
	int componentMaterial;

	// Constants for materials
	public static final int CARBON = 1;
	public static final int ALU = 2;
	public static final int COMPOSITE = 3;
	public static final int STEEL = 4;


	//component_ID, name, delivery_date, stock_amout, vendor and comment as parameters

	public Component(int componentID) {
		this.componentID = componentID;
	}

	public Component() {}

	public Component(int componentID, String name, String deliveryDate, int stockAmount, String vendor, String comment, int componentMaterial) {
		this.componentID = componentID;
		this.name = name;
		this.deliveryDate = deliveryDate;
		this.stockAmount = stockAmount;
		this.vendor = vendor;
		this.comment = comment;	
		this.componentMaterial = componentMaterial;
	}

	public void printComponent() {
		System.out.println("Component ID: " + componentID);
		System.out.println("Name: " + name);
		System.out.println("Delivery Date: " + deliveryDate);
		System.out.println("Stock Amount: " + stockAmount);
		System.out.println("Vendor: " + vendor);
		System.out.println("Comment: " + comment);
		System.out.println("Material: " + getMaterialString(componentMaterial));
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

			System.out.print("Material: ");
			component.componentMaterial = IOTools.readInt();

			System.out.println("Component information entered successfully.");
		} else {
			System.out.println(String.format("Invalid Component ID. Please enter a valid ID (1 - %d).",components.length));
		}
	}

	private String getMaterialString(int componentMaterial) {
		switch (componentMaterial) {
		case CARBON:
			return "Carbon";
		case ALU:
			return "Aluminum";
		case COMPOSITE:
			return "Composite";
		case STEEL:
			return "Steel";
		default:
			return "Unknown Material";
		}
	}
}
