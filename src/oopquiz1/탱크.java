package oopquiz1;

public class 탱크 extends Vehicle {
	public 탱크() {}

	//연료,  연비 세팅,  주행거리는 0
	public 탱크(String name, double 연료량, double 연비) {
		super(name, 연료량, 연비);
	}
	
	public void 포탄쏘기() {		
		System.out.println("쿠쾅쾅쾅");		
	}
	
	public int move() {		
		포탄쏘기();		
		return super.move();		
	}
}
