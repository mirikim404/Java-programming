package week4;


import java.util.Scanner;

public class Reservation {
	static Scanner sc = new Scanner(System.in);
	
	
	public static void 예약하기 (int [][] ar) {
		
		//1. row, col 입력받아서
		//2. 0~9까지가 아니라 1~10까지로 변경해줘야 하므로
		//3. 실제 입력이 1,1 ---> 0,0
		
		int row, col;
		
		while(true) {
			System.out.print("예약할 좌석의 행: ");
			row = sc.nextInt();
			
			if (row<0 || row>ar.length -1 ) {
				System.out.println("올바른 좌석의 인덱스가 아닙니다.");
			}
			
			System.out.print("예약할 좌석의 열: ");
			col = sc.nextInt();
			
			if (col<0 || col>ar.length -1 ) {
				System.out.println("올바른 좌석의 인덱스가 아닙니다.");
			}
			
			if(ar[row][col] == 1) {
				System.out.println("이미 예약된 자리입니다.");
			}
			
			else break;
			
		}
		ar[row][col] = 1;
	}
	
	
	
	public static void 취소하기 (int [][] ar) {
		
		int row, col;
		
		while(true) {
			System.out.print("취소할 좌석의 행: ");
			row = sc.nextInt();
			
			if (row<0 || row>ar.length -1 ) {
				System.out.println("올바른 좌석의 인덱스가 아닙니다.");
			}
			
			System.out.print("취소할 좌석의 열: ");
			col = sc.nextInt();
			
			if (col<0 || col>ar.length -1 ) {
				System.out.println("올바른 좌석의 인덱스가 아닙니다.");
			}
			
			if(ar[row][col] == 0) {
				System.out.println("이미 예약이 없는 자리입니다. 예약하기 메뉴로 넘어가주세요.");
			}
			
			else break;
			
		}
		ar[row][col] = 0;
	}
	
	
	
	public static void 좌석보이기 (int [][] ar) {
		//TODO: □■ 사용해서 나타내기
		for (int row=0; row<ar.length; row++) {
			System.out.printf("{%2d} : ", row+1 );
			for (int col=0; col<ar[row].length; col++) {
				if(ar[row][col]==0) System.out.print("□");
				else System.out.print("■");
			}
			System.out.println();
		}
		
	}
	
	
	
	public static void 메뉴보이기 () {
		System.out.println("=========================================");
		System.out.println("1. 좌석보이기 2. 예약하기 3. 취소하기 ... 0. 종료 ");
		System.out.println("=========================================");

	}
	
	
	

	public static void main(String[] args) {
		int [][] seat = new int [10][10];
		
		// 1. 메뉴보이기
		// 2. 메뉴 입력받기
		// 3. 메뉴대로 처리하기

		while(true) {
			
			메뉴보이기();
			System.out.print("메뉴를 입력하세요: ");
			int menu = sc.nextInt();
			
			if (menu == 0) break;
			if (menu == 1) 좌석보이기(seat);
			if (menu == 2) 예약하기(seat);
			if (menu == 3) 취소하기(seat);
			
				
		}
		
		System.out.println("극장예약시스템을 종료합니다!");
		

	}

}
