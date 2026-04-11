package week5;

/* class Circle {
	// 아무것도 쓰지 않으면 default: 같은 패키지 내에서는 public
	// 만약 public class Circle로 하고 싶으면 새로운 class 파일을 만들어야함.
    int radius; // 원의 반지름 필드
    String name; // 원의 이름 필드

    public Circle() { } // 원의 생성자 메소드

    public double getArea() { // 원의 면적 계산 메소드
        return 3.14 * radius * radius;
    }
} */

public class Lab5_1 {   
    public static void main(String[] args) {
    	
        Circle pizza = new Circle();
        pizza.radius = 10;
        pizza.name = "자바피자";
        System.out.println(pizza.name + "의 면적은 " + pizza.getArea());

        Circle donut = new Circle();
        donut.radius = 2;
        donut.name = "자바도넛";
        System.out.println(donut.name + "의 면적은 " + donut.getArea());
    }
}