package week4;



public class BubbleSort {
	
	public static void sortArray(int[] arr) {
		for (int scan = 0; scan < arr.length; scan++) {
			for (int i =0; i<arr.length -1; i++) {
				if (arr[i] > arr[i+1]) {
					int temp = arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
	
	public static int[] makeArray(int size) {
		int [] arr = new int[size];
		return arr;
	}
	
	public static void setArrayRandom(int[] arr, int min, int max) {
		for (int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * (max-min+1) + min);
		}
	}
	
	public static void showArray(int [] arr) {
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] intArray = makeArray(20);
		setArrayRandom(intArray, 20, 50);
		
		System.out.println("버블정렬 전: "); showArray(intArray);
		
		sortArray(intArray); 
		
		System.out.println("버블정렬 후: "); showArray(intArray);
;
	}

}
