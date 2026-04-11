package week5;

public class Lab5_5 {
	public static void main(String[] args) {
		Circle [] c;
		c = new Circle[5];
		
		for (int i=0; i<c.length; i++)
			c[i] = new Circle(i+1);
		
		for (int i=0; i<c.length; i++)
			System.out.print((int)(c[i].getArea()) + " ");
	}
}
