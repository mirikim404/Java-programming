package week4;

import java.util.Scanner;

public class Lab4_5 {
	
	public static void init_array(int [][] arr) {
		
	}
	

	
	public static void show_array(int [][] arr) {
	    for (int i = 0; i < arr.length; i++) {
	        for (int j = 0; j < arr[i].length; j++) {
	            System.out.print(arr[i][j] + " ");
	        }
	        System.out.println();
	    }
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int [][] intArray = {{10,11,12}, {20,21}, {30,31,32}, {40,41}};
		
		//2차 배열 출력하기
		show_array(intArray);
	}

}
