package oopquiz1;

public class 비행기 extends Vehicle {
	public 비행기() {}
	//연료,  연비 세팅,  주행거리는 0
	public 비행기(String name, double 연료량, double 연비) {
		super(name, 연료량, 연비);
	}
	
	public void 날기() {		
		System.out.println("슝슝~~");		
	}
	
	public int move() {		
		날기();		
		return super.move();		
	}
	
}
