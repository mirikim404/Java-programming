package week4;

import java.util.Scanner;
import java.util.Random;

public class BubbleSort {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static int[] makeArray(int n) {
		int [] arr = new int[n];
		return arr;
	}
	
	public static int[] setArrayRandom(int [] arr, int start, int end) {
		Random r = new Random();
		for (int i=0; i<arr.length; i++) {
			//arr[i] = (int)(Math.random()* (end-start+1)) + start;
			arr[i] = r.nextInt(end-start+1) + start;
		}
		return arr;
	}
	
	public static void bubbleSortArray(int [] arr) {
		for (int  i=0; i<arr.length-1; i++) {
			for (int j=0; j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void showArray(int [] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			if (i!=arr.length-1) System.out.print(" ");
		}
		
	}
	
	public static void main (String[] args) {
		System.out.print("배열의 크기를 입력하세요: ");
		int n = sc.nextInt();
		
		System.out.print("랜덤수의 최소값을 입력하세요: ");
		int min = sc.nextInt();
		
		System.out.print("랜덤수의 최댓값을 입력하세요: ");
		int max = sc.nextInt();
		
		int [] arr = makeArray(n);
		setArrayRandom(arr, min, max);
		int [] init_arr = arr.clone();
		bubbleSortArray(arr);
		
		//출력
		System.out.print("sort 전: ");
		showArray(init_arr);
		System.out.println();
		System.out.print("sort 후: ");
		showArray(arr);
	
	}
}
