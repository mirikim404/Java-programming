package oopquiz1;

public interface Driveable {
	public default void drive() {
		System.out.println("모든 Vehicle을 운전할 수 있습니다. 움직일 객체를 인자로 넣어주세요.");
	}
	
	public default void drive(Vehicle v) {
		System.out.println("모든 Vehicle을 운전할 수 있습니다.");
		v.move();
	}
	
	public default void drive(Moveable m) {
		System.out.println("모든 Moveable한 것들을 운전할 수 있습니다.");
		m.move();
	}

}
