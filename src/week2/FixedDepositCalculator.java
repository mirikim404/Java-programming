package week2;

import java.util.Scanner;

public class FixedDepositCalculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("예치금: ");
		int deposit = input.nextInt();
		
		System.out.println("기간(월): ");
		int period = input.nextInt();
		
		System.out.println("연이율(%): "); //3.5 --> 0.035
		double rate = input.nextDouble();
		
		double interest = deposit * (rate/100) * (period/12.0); 
		//(period/12)는 int/int이므로 0이될수도 있기 때문에 (double)12.0로 나누자
		
		double tax = interest * (15.4/100);
		double totalAmount = deposit + interest - tax;
		
		System.out.println("-------------------------");
		System.out.printf("에치금 %d원을 %d개월동안 연이율 %.2f로 저축하면 총 %.2f원을 수령할 수 있습니다!\n", deposit, period, rate, totalAmount);
		System.out.println("-------------------------");
		System.out.printf("원금 합계 : %d원\n", deposit);
		System.out.printf("세전 이자 : %.2f원\n", interest);
		System.out.printf("이자 과세(15.4%%) : %.2f원\n", tax);
		System.out.printf("세후 수령액 : %.2f원\n", totalAmount);

	}

}
