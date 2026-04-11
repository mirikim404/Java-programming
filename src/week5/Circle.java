package week5;

public class Circle {
    int radius;
    String name;

    public Circle() {
        radius = 1;
        name = "없음";
    }

    public Circle(int r, String n) {
        radius = r;
        name = n;
    }
    
    public Circle(int radius) {
    	this.radius = radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }
}