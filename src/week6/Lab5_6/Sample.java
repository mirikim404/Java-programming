package week6.Lab5_6;

public class Sample {
	public int a;
	private int b; //외부에서 직접 접근 불가
	int c;
	
	// Setter 사용
	public void setB(int b) {
		this.b = b; 
	}
	
	//Getter 사용
	public int getB() {
		return this.b;
	}

}
