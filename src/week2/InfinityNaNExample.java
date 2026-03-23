package week2;


public class InfinityNaNExample {

	public static void main(String[] args) {
		double a = 5.0/0.0; 
		double b = -5.0/0.0;
		double c = 0.0/0.0;
		
		System.out.println("a= " + a);
		System.out.println("b= " + b);
		System.out.println("c= " + c);
		
		System.out.println("a is Infinite?" + Double.isInfinite(a));
		System.out.println("b is Infinite?" + Double.isInfinite(b));
		System.out.println("c is NaN?" + Double.isNaN(c));

	}

}
