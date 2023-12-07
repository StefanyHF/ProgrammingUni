package assignments.assignment_7;

public class TestVehicles {
	public static void main(String[] args) {
		Vehicle raceCar = new RaceCar("Ferrari Formula 1", 140, 775.84, 4, 1.1);
		Vehicle motorBike = new MotorBike("Ducati", 14.7, 173.818, 2, 2.9);

		raceCar.accelerate(0.1);
		motorBike.accelerate(0.1);

		System.out.println(raceCar.bordComputer());
		System.out.println(motorBike.bordComputer());

		System.out.println();

		raceCar.accelerate(1.0);
		motorBike.accelerate(1.0);

		System.out.println(raceCar.bordComputer());
		System.out.println(motorBike.bordComputer());

		System.out.println();

		raceCar.stop();
		motorBike.stop();

		System.out.println(raceCar.bordComputer());
		System.out.println(motorBike.bordComputer());


		ECar fiat = new ECar("FIAT 500", 52.0, 79.076, 4, 2.0, 80);
		ECar tesla = new ECar("Tesla Model S", 47.0, 248.418, 4, 2.0, 100);
		ECar toyota = new ECar("Toyota C-HR", 41.0, 348.418, 4, 1.8, 120);

		GasCar bmw = new GasCar("BMW X5S", 38.0, 198.436, 4, 2.0, 70);
		GasCar honda = new GasCar("Honda Civic", 48.0, 298.437, 4, 2.0, 120);
		GasCar ford = new GasCar("Ford Maverick", 53.0, 258.436, 4, 2.0, 100);

		System.out.println();
		System.out.println();

		System.out.println(fiat.bordComputer());
		System.out.println(tesla.bordComputer());
		System.out.println(toyota.bordComputer());

		System.out.println();

		System.out.println(bmw.bordComputer());
		System.out.println(honda.bordComputer());
		System.out.println(ford.bordComputer());

		ManageCars manage = new ManageCars();
		manage.refillVehicles(new Vehicle[] {fiat, tesla, toyota, bmw, honda, ford});

		System.out.println(fiat.bordComputer());
		System.out.println(tesla.bordComputer());
		System.out.println(toyota.bordComputer());

		System.out.println();

		System.out.println(bmw.bordComputer());
		System.out.println(honda.bordComputer());
		System.out.println(ford.bordComputer());
	}
}
