package week1;

import java.util.Scanner;


public class TypeConversion {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		int 학번;
		int 나이;
		String 이름;
		
		System.out.println("학번 나이 이름을 순서대로 엔터로 구분하여 입력하세요");
		학번 = input.nextInt();
		나이 = input.nextInt();
		
		input.nextLine(); //메모리에 남아있는 enter 먹음
		이름 = input.nextLine();
		
		System.out.printf("%s학번 %d살 %s입니다.", 학번, 나이, 이름);
		

	}
}
