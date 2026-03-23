package week3;

import java.util.Scanner;

public class SuccesssOrFail {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("점수를 입력하시오: ");
		int score = input.nextInt();
		String grade;
		String plusMinus;
		
		
		
		if  (score>=90) grade="A";
		else if (score>=80) grade = "B";
		else if (score>=70) grade = "C";
		else if (score>=60) grade = "D";
		else grade ="F";
		
		// edge case 파악이 중요하다. (F를 받았을 때, 100점을 받았을 때)
		if (grade=="F") plusMinus="";
		else if (score == 100) plusMinus="+";
		else if (score%10>=5) plusMinus="+";
		else plusMinus="-";
		
		System.out.println("학점은" + grade + plusMinus + "입니다.");

	}

}
