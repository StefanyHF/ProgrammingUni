package assignments.assignment_5;

import assignments.assignment_4.Component;
import prog1Tools.IOTools;

public class BestBikeManagement {

	public static void changeComponentInformation(Component[] components) {
		System.out.print(String.format("Enter Component ID (0 - %d): ", components.length-1));
		int componentID = IOTools.readInt();
		if (componentID >= 0 && componentID < components.length) {
			Component component = components[componentID];
			component.printComponent();

			System.out.print("Enter new data for this component (y/n): ");
			char choice = IOTools.readChar();
			if (choice == 'y') {
				Component.writeComponent(components);
			}
		} else {
			System.out.println(String.format("Invalid Component ID. Please enter a valid ID (1 - %d).", components.length));
		}
	}
}