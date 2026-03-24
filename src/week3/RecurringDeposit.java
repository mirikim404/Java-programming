package week3;

import java.util.Scanner;

public class RecurringDeposit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in)
;
		
		System.out.print("월납입금: ");
		int 월납입금 = scanner.nextInt();
		
		System.out.print("적립기간(개월): ");
		int 적립기간 = scanner.nextInt();
		
		System.out.print("연이자율: ");
		double 연이자율 = scanner.nextDouble();
		
		double 월이자율 = 연이자율/12;
		double 총만기금액 = 0;
		int 총납입금 = 월납입금*적립기간;
		
		for(int i=0; i<적립기간; i++) {
			int 남은개월수 = 적립기간 - i;
			double 회차만기금액 = 월납입금 * Math.pow(1+월이자율, 남은개월수);
			// System.out.println(i+1+"달 회차 만기 금액은: "+회차만기금액);
			총만기금액 += 회차만기금액;
			// System.out.println(i+1+"달까지의 총 만기금액은: "+총만기금액);
		}
		
		double 총이자 = 총만기금액 - 총납입금;
		double 세금 = 총이자*15.4/100;
		double 세후이자 = 총이자 - 세금;
		double 세후만기금액 = 총납입금 + 세후이자;
		
		System.out.println("-----------------------------");
		System.out.printf("매월 %d만원씩 %d개월동안\n", 월납입금/10000, 적립기간);
		System.out.printf("연 이율 %.2f로 저축하면\n", 연이자율);
		System.out.printf("총 %.2f원을 수령하실 수 있습니다.\n", 총만기금액);
		System.out.println("-----------------------------");
		System.out.printf("원금합계: %d\n", 총납입금);
		System.out.printf("세전이자: %.2f\n", 총이자);
		System.out.printf("이자과세(15.4%%): %.2f\n", 세금);
		System.out.printf("세후 수령액: %.2f\n", 세후만기금액);
	}

}
