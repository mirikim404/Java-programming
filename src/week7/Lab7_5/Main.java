package week7.Lab7_5;

public class Main {

	public static void main(String[] args) {
		Driver d = new Driver();
		Bus b = new Bus();
		Truck t = new Truck();
		SportCar s = new SportCar();
		Vehicle v = new SportCar();
		
		d.drive(b);
		d.drive(t);
		d.drive(t);
		d.drive(s);
		d.drive(v);

	}

}
