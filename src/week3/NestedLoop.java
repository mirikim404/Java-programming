package week3;

public class NestedLoop {

	public static void main(String[] args) {
		
		int m = 10; //가로
		int n = 5; //세로
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
