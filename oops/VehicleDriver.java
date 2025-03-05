package oops;

public class VehicleDriver {

	public static void main(String[] args) {
		
//		Vehicle v1 = new Vehicle();// CTE(Cannot instantiate the type Vehicle)
		
		Vehicle v1 = new Motorcycle();
		v1.wheels();
		Vehicle v2 = new Car();
		v2.wheels();
		Vehicle v3 = new Truck();
		v3.wheels();
	}

}
