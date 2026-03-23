package week2;

import java.util.Scanner;

public class RobotReporter {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("지역을 입력하세요: ");
		String location = input.nextLine();
		
		System.out.println("날짜를 입력하세요 (예: 2026-01-12): ");
		String date = input.nextLine();
		
		System.out.println("날씨 상태를 입력하세요 (예: 맑음, 흐림, 비): ");
		String weather = input.nextLine();
		
		System.out.println("최고 기온을 입력하세요: ");
		int maxTemp = input.nextInt();
		
		System.out.println("최저 기온을 입력하세요: ");
		int minTemp = input.nextInt();
		input.nextLine();
		
		System.out.println("추가 메시지를 입력하세요: ");
		String message = input.nextLine();
		
		System.out.println("제목: " + location + " 오늘의 날씨");
		System.out.println("날짜: " + date);
		System.out.println("");
		System.out.printf("오늘 %s 날씨 %s 예상됩니다.\n", location, weather);
		System.out.printf("기온은 최고 %d도, 최저 %d도로 예상됩니다.\n", maxTemp, minTemp);
		System.out.println(message);
		System.out.println();
		System.out.println("이상 로봇기자가 전해드렸습니다.");

	}

}
