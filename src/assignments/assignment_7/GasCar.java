package assignments.assignment_7;

public class GasCar extends Vehicle {
	private CombustEngine engine;

	public GasCar(String name, double fuel, double power, int tiresNumber, double pressure, double maxFuelLevel) {
		super(name, fuel, power, tiresNumber, pressure);
		this.engine = new CombustEngine(fuel, power, maxFuelLevel);
	}

	public CombustEngine getEngine() {
		return engine;
	}
}
