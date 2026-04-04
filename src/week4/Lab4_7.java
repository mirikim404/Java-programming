package week4;

import java.util.Scanner;

public class Lab4_7 {
	
	public static Scanner sc = new Scanner(System.in);

	
	public static int inputArray(String[] arr) {
		int i = 0;
		while (i<10) {
			System.out.print("to-do["+(i+1)+"] : ");
			String value = sc.next();
			arr[i] = value;
			
			if (value.equals(".")) break;
			
			i++;
		}
		return i;
	}
	
	public static void showArray(String[] arr, int count) {
		System.out.println("=======================================");
		
		for (int i=0; i<count; i++) {
			System.out.println(i + " : " + arr[i]);
		}
		
		
		System.out.println("=======================================");
		
	}
	
	public static void main(String[] args) {
		
		String [] memo = new String [10];
		int count = inputArray(memo);
		showArray(memo, count);
		
		

	}

}
