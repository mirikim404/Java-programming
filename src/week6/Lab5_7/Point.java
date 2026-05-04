package week6.Lab5_7;

public class Point {
	private int x;
	private int y;
	
	// setter: 외부에서 들어온 값을 내 x에 저장
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	// getter: 내 변수 x의 값을 밖으로 전달
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	
	// setter: 두 값을 한꺼번에 전달하는 setter
	public void setXY (int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void printXY() {
		System.out.println("(" + x + "," + y + ") 좌표 생성");
	}
	
	// 기본생성자: 아무 값도 안 주고 "new Point()" 했을 때 실행됨
	public Point() {
		this.x=0;
		this.y=0;
		printXY();
	}
	// 매개변수가 있는 생성자: "new Point(10, 20)" 처럼 값을 주며 만들 때 실행됨
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
		printXY();
	}
}
