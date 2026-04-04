package week4;

import java.util.Scanner;

public class Lab4_3 {
	
	enum Week { 월, 화, 수, 목, 금, 토, 일 }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] n = {1, 2, 3, 4, 5};
        String[] names = {"사과", "배", "바나나", "체리", "딸기", "포도"};
        int sum = 0;

        for (int k : n) {
            System.out.print(k + " ");
            sum += k;
        }
        System.out.println("합은" + sum);

        for (String s : names)
            System.out.print(s + " ");
        System.out.println();

        for (Week day : Week.values())
            System.out.print(day + "요일 ");
        System.out.println();
		
		

	}

}
