package week6.Lab5_8;

public class Counter {
	// static 멤버: 모든 객체가 공유
	public static int totalCount = 0;
	
	// non-static 멤버: 각 객체마다 독립적 존재
	public int instanceCount = 0;
	
	public void order() {	// non-static 메소드
		instanceCount++;
		totalCount++;
	}
	
	public static void showTotal() {	// static 메소드
		System.out.println("전체 카운트: " + totalCount);
	}

	
}
