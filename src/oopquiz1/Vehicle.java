package oopquiz1;

public class Vehicle implements Moveable {
	
	private String name;
	private int 주행거리;
	private double 연료량;
	private double 연비;
	
	public Vehicle() {}
	
	public Vehicle(String name, double 연료량, double 연비) {
		this.name = name;
		this.연료량 = 연료량;
		this.연비 = 연비;
		this.주행거리 = 0;
	}
	
	//getter/setter
	public String getName() {return name;}
	public double get연료량() {return 연료량;}
	public void set연료량(double 연료량) {this.연료량 = 연료량;}
	public double get연비() {return 연비;}
	public void set연비(double 연비) {this.연비 = 연비;}
	public double get주행거리() {return 주행거리;}
	public void set주행거리(int 주행거리) {this.주행거리 = 주행거리;}

	
	//출력 메소드
	void show_header() {
		System.out.println("-------------------------------------------------------------");
		System.out.printf("  %16s | %10s(km)  %10s(l)  %10s(km/l)\n", "이름" , "총주행거리", "연료량", "연비") ;
		System.out.println("-------------------------------------------------------------");
	}
	
	void show() {
		System.out.printf("%16s | %10.0f         %10.2f        %10.2f", this.name, this.주행거리 , this.연료량, this.연비 ) ;
		System.out.println();
	}
	
	// 클래스로 호출했기 때문에 static
	static void show(Vehicle [] vs) {
		vs[0].show_header();	// 아무 객체나 불러서 호출(this를 안쓰므로)
		for(int i=0; i<vs.length; i++) {
           vs[i].show();
		}
		System.out.println();
	}
	
	
	@Override
	public int move() {
		double 필요연료 = 10.0 / 연비;
		
		if (연료량 < 필요연료) {
			System.out.println("연료가 부족합니다. 이 차는 더 이상 움직일 수 없습니다.");
			System.out.println("총 주행 거리 : " + (int)주행거리);
			return (int) 주행거리;
		}
		
		연료량 -= 필요연료;
		주행거리 += 10;
		
		System.out.printf("%16s | %10d         %10.2f        %10.2f\n",
                name, (int) 주행거리, 연료량, 연비);
        return (int) 주행거리;
	}
	
	
}
