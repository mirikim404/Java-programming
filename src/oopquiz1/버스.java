package oopquiz1;

public class 버스 extends Vehicle{
	public 버스() {}

	//연료,  연비 세팅,  주행거리는 0
	public 버스(String name, double 연료량, double 연비) {
		super(name, 연료량, 연비);
	}
	
	public void 운행하기() {		
		System.out.println("부릉부릉부르릉~~");		
	}
	
	public void 마을한바퀴돌기() {
		System.out.println("마을을 돌아요 부릉부릉~");
	}
	
	public int move() {		
		운행하기();
		마을한바퀴돌기();
		return super.move();		
	}
}
