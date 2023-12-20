package assignments.assignment_7;

public class GasCar extends Vehicle {
	public GasCar(String name, double fuel, double power, int tiresNumber, double pressure, double maxFuelLevel) {
		super(name, fuel, power, tiresNumber, pressure);
		super.tireType = new Tire(pressure);
		super.engineType = new CombustEngine(fuel, power, maxFuelLevel);
	}
}
