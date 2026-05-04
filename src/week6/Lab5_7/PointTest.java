package week6.Lab5_7;

public class PointTest {

	public static void main(String[] args) {
		
		Point myPoint1 = new Point();
		
		// myPoint.x =3; myPoint.y=4; 는 불가능
		myPoint1.setXY(3, 4);
		myPoint1.printXY();
		
		Point myPoint2 = new Point(10, 20);
		myPoint2.printXY();
		myPoint2.setXY(30, 40);
		myPoint2.printXY();

	}

}
