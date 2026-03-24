package week3;

import java.util.Scanner;

public class Wishlist {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("위시리스트 개수 입력: ");
		int count = scanner.nextInt();
		scanner.nextLine();
		
		String[] 이름 = new String[count];
		int[] 가격 = new int[count];
		int 총합 = 0;
		
		for (int i=0; i<count; i++) {
			System.out.print("[" + i + "] 아이템 이름 입력: ");
			이름[i] = scanner.nextLine();
			
			System.out.print("가격 입력: ");
			가격[i] = scanner.nextInt();
			scanner.nextLine();
			
			총합 += 가격[i];
			System.out.println("현재까지 총 비용: " + 총합 + "원");
			
		}
		
		System.out.println("=== 최종 위시리스트 ===");
		for (int i=0; i<count; i++) {
			System.out.println(이름[i] + " : " + 가격[i] + "원");	
		}
		
		System.out.println("--------------");
	

	}

}
