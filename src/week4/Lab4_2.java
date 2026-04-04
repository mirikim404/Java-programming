package week4;

import java.util.Scanner;
public class Lab4_2 {
	
	public static Scanner sc = new Scanner(System.in);
	
	
	public static int imput_values_in_array(int [] arr, int n) {
		
		System.out.println(n + "개의 정수를 입력하세요>>");
		
		int sum = 0;
		
		for (int i=0; i<arr.length; i++) {
			
			System.out.print("["+i+"] : ");
			int value = sc.nextInt();
			arr[i] = value;
			sum += value;
			
		}
		
		return sum;
	}
	
	public static void show_array(int [] arr) {
		System.out.print("array : ");
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			if(i!=arr.length-1) System.out.print(",");
		}
	}

	public static void main(String[] args) {
		
		System.out.print("몇 개의 정수를 입력하시겠습니까? ");
		int n = sc.nextInt();
		
		int [] intArray = new int[n];
		
		
		int sum = imput_values_in_array(intArray, n);
		
		show_array(intArray);
		System.out.println();
		System.out.println("총 합: " + sum);
		double average = (double)sum / n;
		average = Math.round(average * 10.0) / 10.0;
		System.out.println("평균은 " + average);

	}

}
