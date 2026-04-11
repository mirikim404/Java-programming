package week5;

import java.util.Scanner;

class Rectangle {
	//Lab5_1과 마찬가지로 public calss Rectangle은 새로운 class 파일 필요
	int width;
	int height;
	
	public int getArea() {
		return width*height;
	}
}


public class Lab5_2 {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(); // 객체 생성
		Scanner input = new Scanner(System.in);
		
		System.out.print(">> 가로: ");
		rect.width = input.nextInt();
		System.out.print(">> 세로: ");
		rect.height = input.nextInt();
		
		System.out.println("사각형의 면적은 " + rect.getArea());
		input.close();
		
		
		

	}

}
