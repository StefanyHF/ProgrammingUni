package assignments.assignment_4;

import assignments.assignment_5.BestBikeManagement;
import prog1Tools.IOTools;

// Assignments 4.2/ 5.4 / 6.4

public class BestBikeComponents {
	public static void main(String[] args) {
		Component[] components = new Component[20]; // array with 20 elements (index 0-19)
		
		Component materialComponent = new Component(1, "Frame", "20211111", 20, "Best Frames Ever", "good deal", Component.ALU);
		components[0] = materialComponent;
		
		// initializes the other elements of the component array with component objects
		for (int i = 1; i < components.length; i++) {
			components[i] = new Component(i);
		}

		BestBikeComponents bestBikeComponents = new BestBikeComponents();
		bestBikeComponents.start(components);
	}

	public void start(Component[] components) {
		boolean exitProgram = false;
		while (!exitProgram) {
			System.out.println("================");
			System.out.println("Manage Components");
			System.out.println("================");
			System.out.println("1 = Enter Component Information");
			System.out.println("2 = Print Component Information");
			System.out.println("3 = Change Component");
			System.out.println("4 = End Program");
			System.out.print("Please select: ");

			int choice = IOTools.readInt();

			switch (choice) {
			case 1:
				Component.writeComponent(components);
				break;
			case 2:
				printComponentsInformation(components);
				break;
			case 3:
				BestBikeManagement.changeComponentInformation(components);
				break;
			case 4:
				System.out.println("Program Ended.");
				exitProgram = true;
				break;
			default:
				System.out.println("Invalid choice. Please select a valid option.");
			}
		}

	}


	public static void printComponentsInformation(Component[] components) {
		System.out.print(String.format("Enter Component ID (0 - %d): ", components.length-1));
		int componentID = IOTools.readInt();
		if (componentID >= 0 && componentID < components.length) {
			Component component = components[componentID];
			component.printComponent();
		} else {
			System.out.println(String.format("Invalid Component ID. Please enter a valid ID (1 - %d).",components.length));
		}
	}
}

