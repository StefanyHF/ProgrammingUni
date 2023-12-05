package assignments.assignment_7;

public class CombustEngine extends Engine {
	private double maxFuelLevel;

	public CombustEngine(double fuelLevel, double power, double maxFuelLevel) {
		super(fuelLevel, power);
		this.maxFuelLevel = maxFuelLevel;
	}

	public double getMax() {
		return maxFuelLevel;
	}
}
