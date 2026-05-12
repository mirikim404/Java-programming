package oopquiz1;


public class Main {

	public static void main(String[] args) {
		// name, 연료량, 연비
		버스 b = new 버스("타요버스", 100, 12);
		비행기 a = new 비행기("쑝비행기", 100, 0.1);
		탱크 t = new 탱크("탱크탱크", 50, 4);
		
		Driver d = new Driver("미미");
		Vehicle [] vs = {b, a, t};
		
		Vehicle.show(vs)
;
		d.drive();
		d.drive(vs);
		
		// 인스턴스 없이 클래스명으로 호출
		Vehicle.show(vs);
	}

}
