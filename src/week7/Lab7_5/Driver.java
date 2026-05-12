package week7.Lab7_5;

public class Driver {

    public void drive(Vehicle v){
    	System.out.println("Vehicle 운전!");
    	v.run();
    }
    
    public void drive(SportCar c) {
    	System.out.println("SportCar 운전!");
    	c.run();
    }

}
