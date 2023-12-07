package assignments.assignment_7;

abstract class Vehicle {

	protected String name;
	protected int tiresNumber;
	protected Engine engineType;
	protected Tire tireType;
	protected boolean driving;
	protected boolean drivingFast;

	public Vehicle(String name, double fuel, double power, int tiresNumber, double pressure) {
		this.name = name;
		this.tiresNumber = tiresNumber;
		this.engineType = new Engine(fuel, power);
		this.tireType = new Tire(pressure);
		this.driving = false;
		this.drivingFast = false;
	}

	public Vehicle() {}

	public void accelerate(double percentage) {
		driving = true;
		engineType.stepOnTheGas(percentage);
		drivingFast = percentage > 0.5;
	}

	public void stop() {
		driving = false;
	}

	public String bordComputer() {
		return "Instruments currently show:\n" + name
				+ (driving ? (drivingFast ? " driving really fast" : " driving") : " stopped") + " with "
				+ engineType.getHorsePower() + " hp" + "\nwith fuel level at " + engineType.getFuelLevel() + " liters"
				+ "\nwith " + tiresNumber + " tires" + "\nwith pressure at " + tireType.getPressure() + " bar";			
	}

	public void refillEngine(double maxFuel) {
		engineType.setFuelLevel(maxFuel);
		driving = false;
	}
}
