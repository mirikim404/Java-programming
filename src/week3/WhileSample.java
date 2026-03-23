package week3;

import java.util.Scanner;

public class WhileSample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n;
		int sum = 0;
		int count = 0;
		double average;
		
		while(true) {
			n = input.nextInt();
			if (n==-1) break;
			sum+=n;
			count ++;
		}
		
		// sum or count 둘 중 하나라도 double이면 double
		// 전체에 double을 씌우면 안됨! 나누기 전에 씌워야함. 
		average = (double)sum/count;
		
		System.out.println("합: " + sum);
		System.out.printf("평균: %.2f", average);

	}

}
