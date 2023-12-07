package assignments.assignment_7;

public class EEngine extends Engine {
	private double maxEnergy;

	public EEngine(double fuelLevel, double power, double maxEnergy) {
		super(fuelLevel, power, maxEnergy);
		this.maxEnergy = maxEnergy;
	}

	@Override
	public double getMax() {
		return maxEnergy;
	}
}
