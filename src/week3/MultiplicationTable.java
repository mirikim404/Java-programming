package week3;


import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("출력할 마지막 단 입력: ");
		int 단 = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("홀수/짝수 선택 (odd/even): ");
		String 홀짝 = scanner.nextLine();
		
		
		System.out.println("=== 결과 ===");
		
		
		
		for (int i=0; i<단; i++) {
			
			// odd가 true -> i%2 == 1 반환
			// odd가 false -> i%2 == 0 반환
			boolean 출력 = 홀짝.equals("odd") ? (i%2==1) : (i%2==0 && i != 0);
			
		   /*boolean isOdd = 홀짝.equals("odd") && i%2 ==1;
		   boolean isEven = 홀짝.equals("even") && i%2 == 0;*/
		   
		   if (출력) {
			   System.out.println(i + "단");
				for(int j=0; j<9; j++) {
					System.out.println(i + "x" + (j+1) + "=" + i*(j+1));
					}
				System.out.println();
		   }
		}
		
		
		
		
		
		
		/* int i = 0;
		
		
		if (홀짝.equals("odd")) {
			while (i<단) {
			i++;
			if (i%2 == 1) {
				System.out.println(i + "단");
				for(int j=0; j<9; j++) {
					System.out.println(i + "x" + (j+1) + "=" + i*(j+1));
					}
				System.out.println();
				}
			}
		}
		else if (홀짝.equals("even")) {
			while (i<단) {
				i++;
				if (i%2 == 0) {
					System.out.println(i + "단");
					for(int j=0; j<9; j++) {
						System.out.println(i + "x" + (j+1) + "=" + i*(j+1));
						}
					System.out.println();
					}
				}
		}*/
		
		
		
		
		
		

	}

}
