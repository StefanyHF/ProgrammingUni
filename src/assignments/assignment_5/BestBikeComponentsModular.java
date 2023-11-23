package assignments.assignment_5;

import assignments.assignment_4.BestBikeComponents;
import assignments.assignment_4.Component;
import prog1Tools.IOTools;

public class BestBikeComponentsModular extends BestBikeComponents {

	public static void main(String[] args) {

		BestBikeComponentsModular componentModular = new BestBikeComponentsModular();

		int componentNumber = componentModular.getUserInput();

		Component[] components = componentModular.createComponentsArray(componentNumber);

		componentModular.start(components);

	}

	@Override
	public void start(Component[] components) {
		super.start(components);
	}


	public int getUserInput() {
		System.out.print("Enter the number of components: ");
		return IOTools.readInt();
	}

	public Component[] createComponentsArray(int componentsNumber) {
		if(componentsNumber <= 0) throw new IllegalArgumentException("Invalid input. Number must be greater than zero.");

		Component[] components = new Component[componentsNumber];

		// initializes the component array with component objects.
		for (int i = 0; i < components.length; i++) {
			components[i] = new Component(i);
		}
		return components;
	}
}
