package week3;

import java.util.Scanner;

public class Wishlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* System.out.print("개수: ");
        int n = sc.nextInt();
        sc.nextLine();

        String result = "";
        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("이름: ");
            String name = sc.nextLine();

            System.out.print("가격: ");
            int price = sc.nextInt();
            sc.nextLine();

            result += name + " : " + price + "원\n";
            total += price;
        }*/
        String result = "";
        int total = 0;
        
        while (true) {
        	System.out.print("계속 입력하려면 1, 종료하려면 0을 입력하시오: ");
        	int status = sc.nextInt();
        	sc.nextLine();
        	if (status == 0) break;
        	else if (status == 1) {
        		System.out.print("이름: ");
        		String name = sc.nextLine();
        		System.out.print("가격: ");
        		int price = sc.nextInt();
        		sc.nextLine();
        		
        		result += name + " : " + price + "원\n";
        		total += price;
        		
        	}
        }
        

        System.out.println("\n=== 최종 위시리스트 ===");
        System.out.print(result);
        System.out.println("총 금액: " + total + "원");
    }
}
