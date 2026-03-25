package week4;

import java.util.Scanner;

public class Lab4_6 {
	
	//Scanner: 전역변수
	public static Scanner scanner = new Scanner(System.in);
	
	// 2차원 비정방행열을 생성하고 리턴
	public static int [][] makeArray(int n) {
		int [][] arr = new int[n][];
		
		// n을 써도 되는건가? 
		// arr.length를 쓰는게 더 좋은코드?
		for (int i=0; i<n; i++) {
			System.out.print(i+1 + "행의 열 개수: ");
			int col = scanner.nextInt();
			arr[i] = new int[col];
		}
		
		return arr;
		
	}
	
	// 리턴할 필요 없음
	// 2차원 배열 인자로 받아서 초기화
	// 초기화 규칙은 10, 11, 12 ... / 20, 21, 22, 23 ...
	public static void initArray(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				arr[i][j] = (i+1) * 10 + j;
			}
		}
	}

	public static void main(String[] args) {
		// 1. 배열 공간 생성 makeArray()
		// 2. 값 초기화하기 initArray()
		System.out.println("행 개수 입력: ");
		int n = scanner.nextInt();
		
		int[][] arr = makeArray(n);
		
		initArray(arr);
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			
			}
			System.out.println();
			
		}
		
		
		
		

	}

}
