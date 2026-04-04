package week4;

import java.util.Scanner;

public class Lab4_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int intArray[] = new int[5];
		int value, max = 0;
		
		System.out.println("양수 5개를 입력하세요.");
		for (int i=0; i<5;) {
			System.out.print("[" + i + "] : ");
			value = sc.nextInt();
			if (value<0) continue;
			
			intArray[i]=value;
			if (intArray[i]>max)
				max = intArray[i];
			
			i++;
			
			
		}
		System.out.print("가장 큰 수는" + max + "입니다.");
	}

}
