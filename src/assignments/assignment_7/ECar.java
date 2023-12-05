package assignments.assignment_7;

public class ECar extends Vehicle {
	private EEngine engine;

	public ECar(String name, double fuel, double power, int tiresNumber, double pressure, double maxEnergy) {
		super(name, fuel, power, tiresNumber, pressure);
		engine = new EEngine(fuel, power, maxEnergy);
	}

	public EEngine getEngine() {
		return engine;
	}

	@Override
	public String bordComputer() {
		return 	"Instruments currently show:\n" + this.name
				+ (driving ? (drivingFast ? " driving really fast" : " driving") : " stopped") + " with "
				+ engineType.getHorsePower() + " hp" + "\n with charging status at " + engine.getFuelLevel() + " Percent"
				+ "\nwith " + tiresNumber + " tires" + "\nwith pressure at " + tireType.getPressure() + " bar";
	}
}
