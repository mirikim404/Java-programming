package oopquiz1;

public class Driver implements Driveable {

	private String name;
	private int distance;
	
	public Driver () {}
	
	public Driver (String name) {
		this.name = name;
		this.distance = 0;
	}
	
	 @Override
	public void drive(Vehicle v) {
        System.out.println(v.getName() + "를 운전합니다.");
        distance += v.move();
    }

    public void drive(버스 b) {
        System.out.println("버스를 운전합니다.");
        distance += b.move();
    }

    public void drive(탱크 t) {
        System.out.println("탱크를 운전합니다.");
        distance += t.move();
    }

    public void drive(Vehicle[] vs) {
        for (int i = 0; i < vs.length; i++) {
            drive(vs[i]);
        }
        System.out.println("총 주행 거리 : " + (int)distance);
    }
    
   
}
