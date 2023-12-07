package assignments.assignment_7;

public class ECar extends Vehicle {
	public ECar(String name, double fuel, double power, int tiresNumber, double pressure, double maxEnergy) {
		super(name, fuel, power, tiresNumber, pressure);
		super.tireType = new Tire(pressure);
		super.engineType = new EEngine(fuel, power, maxEnergy);	 
	}


	@Override
	public String bordComputer() {
		return 	"Instruments currently show:\n" + this.name
				+ (driving ? (drivingFast ? " driving really fast" : " driving") : " stopped") + " with "
				+ engineType.getHorsePower() + " hp" + "\nwith charging status at " + engineType.getFuelLevel() + " Percent"
				+ "\nwith " + tiresNumber + " tires" + "\nwith pressure at " + tireType.getPressure() + " bar";
	}
}
