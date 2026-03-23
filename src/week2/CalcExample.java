package week2;
import java.util.Scanner;

public class CalcExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("첫 번째 정수 입력: ");
		int a = input.nextInt(); 
		
		System.out.println("두 번째 정수 입력: ");
		int b = input.nextInt();
		
		System.out.println("\n=== 결과 ===");
		System.out.printf("%d + %d = %d%n", a, b, a+b);
		System.out.printf("%d - %d = %d%n", a, b, a-b);
		System.out.printf("%d * %d = %d%n", a, b, a*b);
		System.out.printf("%d / %d = %d%n", a, b, a/b);
		System.out.printf("%d %% %d = %d%n", a, b, a%b);
		

	}

}
