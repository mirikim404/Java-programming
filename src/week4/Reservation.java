package week4;

import java.util.ArrayList;
import java.util.Scanner;

public class Reservation {
	public static Scanner sc = new Scanner(System.in);
	
	public static void showMenu() {
		System.out.println("-------------------------------------------");
		System.out.println("1.좌석현황 2.예약하기 3.취소하기 4.n자리예약하기 0.종료");
		System.out.println("-------------------------------------------");
	}
	
	public static int[][] makeArray() {
		int [][] arr = new int [10][10];
		return arr;	
	}
	
	public static void initArray(int [][] arr) {
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				arr[i][j] = 0;
			}
		}
	}
	
	public static void showSeat(int [][] arr) { 
		for (int i=0; i<arr.length; i++) {
			System.out.printf("%2d : ", i+1);
			for (int j=0; j<arr[i].length; j++) {
				if(arr[i][j] == 0) System.out.print("□");
				if(arr[i][j] == 1) System.out.print("■");
			}
			System.out.println();
		}
	}
	
	public static void reserveSeat(int [][] arr) {
		int row, col; 
		while (true) {
			System.out.print("예약할 행: ");
			row = sc.nextInt();
			System.out.print("예약할 열: ");
			col = sc.nextInt();
			if (row < 1 || row > 10 || col<1 || col>10) {
				System.out.println("그런 좌석은 없습니다.");
				continue;
			}
			break;
		}
		arr[row-1][col-1] = 1;
	}
	
	
	public static void cancelSeat(int [][] arr) {
		int row, col; 
		String reply;
		while (true) {
			System.out.print("취소할 행: ");
			row = sc.nextInt();
			System.out.print("취소할 열: ");
			col = sc.nextInt();
			sc.nextLine();
			
			if (row < 1 || row > 10 || col<1 || col>10) {
				System.out.println("그런 좌석은 없습니다."); continue;
			}
			
			if (arr[row-1][col-1]==0) {
				System.out.print("비어있는 좌석입니다. 예약하기로 이동하시겠습니까? (Y/N) --");
				reply = sc.nextLine();
				if (reply.equals("Y")) reserveSeat(arr);
				if (reply.equals("N")) System.out.println("취소하기를 종료합니다. ");
			}
			
			break;
		}
		
		arr[row-1][col-1] = 0;
	}
	
	public static void reserveConsecutive(int [][] arr) {
		
		System.out.print("몇자리를 예약하시겠습니까? ");
		int n = sc.nextInt();
		int count = 0;
		ArrayList<int[]> possible = new ArrayList<>();
		
		for (int i=0; i<arr.length; i++) {
			count = 0;
			for (int j=0; j<arr[i].length; j++) {
				if (arr[i][j] == 1) {
				    if (count >= n) possible.add(new int[]{i+1, j});
				    count = 0;
				} else {
				    count++;
				    if (count >= n) possible.add(new int[]{i+1, j+1});
				}
			}
		}
		System.out.println("예약가능한 자리는 다음과 같습니다");
		for (int[] pair : possible) {
			System.out.println(pair[0] + "행 " + (pair[1]-n+1) + "열 부터 " + pair[1] + "열까지 가능합니다.");
		}
			
	}
	
	public static void completeReservation(int [][] arr) {
		int vipSum=0;
		int commonSum=0;
		int totalSum=0;
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				if (arr[i][j]==1) {
					if (i==0 || i==1) vipSum+=10000;
					else commonSum+=5000;
				}
			}
		}
		totalSum = vipSum + commonSum;
		System.out.println("총 가격은 " + totalSum + "입니다.");
	}
	
	
	public static void main (String [] args) {
		
		int [][] intArray = makeArray();
		initArray(intArray);
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		while(true) {
			showMenu();
			System.out.print("menu: ");
			int n = sc.nextInt();
			
			if (n==0) break;
			if (n==1) showSeat(intArray);
			if (n==2) reserveSeat(intArray);
			if (n==3) cancelSeat(intArray);
			if (n==4) reserveConsecutive(intArray);
		}
		
		completeReservation(intArray);
		
		
	}
	
	
}
