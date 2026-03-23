package week2;

import java.util.Scanner;

public class OrderProgram {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("== 주문하세요 ==");
		System.out.print("메뉴 1 이름 입력: ");
		String menu1 = input.nextLine();
		System.out.print("가격 입력: ");
		int price1 = input.nextInt();
		System.out.print("수량 입력: ");
		int quantity1 = input.nextInt();
		input.nextLine();
		System.out.println("");
		System.out.print("메뉴 2 이름 입력: ");
		String menu2 = input.nextLine();
		System.out.print("가격 입력: ");
		int price2 = input.nextInt();
		System.out.print("수량 입력: ");
		int quantity2 = input.nextInt();
		input.nextLine();
		System.out.println("");
		System.out.print("메뉴 3 이름 입력: ");
		String menu3 = input.nextLine();
		System.out.print("가격 입력: ");
		int price3 = input.nextInt();
		System.out.print("수량 입력: ");
		int quantity3 = input.nextInt();
		
		System.out.println("");
		
		int amount1 = price1 * quantity1;
		int amount2 = price2 * quantity2;
		int amount3 = price3 * quantity3;
		int totalAmount = amount1 + amount2 + amount3;
		
		
		System.out.println("== 영수증 ==");
		System.out.printf("메뉴: %-6s | 단가: %6d원 | 수량: %3d개 | 합계: %6d원\n", menu1, price1, quantity1, amount1);
		System.out.printf("메뉴: %-6s | 단가: %6d원 | 수량: %3d개 | 합계: %6d원\n", menu2, price2, quantity2, amount2);
		System.out.printf("메뉴: %-6s | 단가: %6d원 | 수량: %3d개 | 합계: %6d원\n", menu3, price3, quantity3, amount3);
		System.out.println("-------------------");
		System.out.printf("총 결제 금액: %d원\n", totalAmount);
		
		
		System.out.print("지불 금액 입력: ");
		int payment = input.nextInt();
		
		System.out.print("할인 쿠폰 입력(%): ");
		int discountRate = input.nextInt();
		
		int realTotalAmount = (int)(totalAmount * (1 - discountRate / 100.0));
		int change = payment - realTotalAmount;
		int thousand = change/1000;
		int fiveHundred = (change%1000)/500;
		int hundred = (change%500)/100;
		int remain = change - (thousand*1000) - (fiveHundred*500) - (hundred*100);
		
		System.out.println("거스름돈: " + change + "원");
		System.out.println("1000원: " + thousand + "개");
		System.out.println("500원: " + fiveHundred + "개");
		System.out.println("100원: " + hundred + "개");
		System.out.println("잔돈: " + remain + "원은 알바에게~");
		
	}

}
