package week6.Lab5_8;

public class Main {

	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
		c1.order(); 
		c2.order();
		c2.order();
		c3.order();
		
		System.out.println("c1의 instanceCount: " + c1.instanceCount);
		System.out.println("totalCount: " + Counter.totalCount);
		
		Counter.showTotal();

	}

}
