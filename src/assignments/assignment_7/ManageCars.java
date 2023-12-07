package assignments.assignment_7;

public class ManageCars extends Vehicle {
	public ManageCars(String name, double fuel, double power, int tiresNumber, double pressure) {
	}

	public ManageCars(){};

	public void refillVehicles(Vehicle[] vehicles) {
		for(Vehicle vehicle : vehicles) {
			vehicle.refillEngine(vehicle.engineType.getMax());
		}
	}
}
