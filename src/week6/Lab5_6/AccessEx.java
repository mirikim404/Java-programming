package week6.Lab5_6;

public class AccessEx {
	public static void main(String[] args) {
		Sample aClass = new Sample();
		aClass.a = 10;
		// aClass.b = 10; // 오류 발생!
		// 해결: Setter를 통해 값 전달
		aClass.setB(10);
		// 해결: Gettter를 사용해 값 출력
		System.out.println("b: " + aClass.getB());
		aClass.c = 10;
	}
}
