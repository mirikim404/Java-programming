package week1;

import java.util.Scanner;


public class CircleArea {
	
	public static void main(String[] args) {
		final double PI = 3.14; 
		
		double radius = 10.0;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("반지름을 입력하세요");
		radius = input.nextDouble();
		
		double circleArea = radius*radius*PI;
		
		System.out.println("원의 면적 = " + circleArea);
		
	}
}
