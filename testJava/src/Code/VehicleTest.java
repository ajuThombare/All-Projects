package Code;

class FlyingVehicle {
	public void fly() {
		System.out.println("This Flying vehicle is:");
	}

	public void land() {
		System.out.println("The Landed Vehicle is:");
	}
}

class spaceShip extends FlyingVehicle {
	String name = "Space Shipe";

	@Override
	public void fly() {
		super.fly();
		System.out.println(" " + name);
	}

	@Override
	public void land() {
		super.land();
		System.out.println(" " + name);
	}
}

class AirPlane extends FlyingVehicle {
	String name = "AirPlane";

	@Override
	public void fly() {
		super.fly();
		System.out.println(" " + name);
	}

	@Override
	public void land() {
		super.land();
		System.out.println(" " + name);
	}
}

public class VehicleTest {
	public static void main(String[] args) {
		FlyingVehicle v1 = new AirPlane();
		v1.fly();
		v1.land();
		FlyingVehicle v2 = new spaceShip();
		v2.fly();
		v2.land();
	}
}
