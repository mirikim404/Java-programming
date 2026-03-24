package week3;

import java.util.Scanner;

public class Shape {
	static Scanner input = new Scanner(System.in);
	
	//삼각형, 사각형 그리는 메소드 구현하기!
	//인자없고 리턴값 없음
	
	public static void 왼쪽직각삼각형그리기(int height) {
		//
		for(int i=0; i<height; i++) {
			System.out.printf("%2d : ", i+1);
			
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void 오른쪽직각삼각형그리기(int height) {
		for(int i=0; i<height; i++) {
			System.out.printf("%2d : ", i+1);
			
			//빈칸 찍는 반복문 (빈칸 + 별 = 높이)
			for(int k=0; k<height-i+1; k++) {
				System.out.print("  "); //별문자 크기만큼의 빈칸
			}
			
			//별 찍는 반복문
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void 정삼각형그리기(int height) {
		for(int i=0; i<height; i++) {
			System.out.printf("%2d : ", i+1);
			
			//빈칸 찍는 반복문 (빈칸 + 별 = 높이)
			for(int k=0; k<height-i-1; k++) {
				System.out.print(" "); //별문자 크기만큼의 1/2칸
			}
			
			//별 찍는 반복문
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	//가로, 세로를 입력받아 사각형을 그리는 메소드!
	//메소드 overloading! 
	public static void 사각형그리기(int width, int height) {
		
		for(int i=0; i<height; i++) {
			System.out.printf("%2d : ", i+1);
			
			for(int j=0; j<width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void 거꾸로정삼각형그리기(int height) {
		for(int i=0; i<height; i++) {
			System.out.printf("%2d : ", i+1);
			
			//빈칸 찍는 반복문
			for(int k=0; k<i; k++) {
				System.out.print(" "); //1칸
			}
			
			//별 찍는 반복문
			for(int j=0; j<height-i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
	}
	
	public static void 모래시계그리기(int height) {
		거꾸로정삼각형그리기(height);	
		정삼각형그리기(height);
	}
	
	public static void 다이아몬드그리기(int height) {
		정삼각형그리기(height);
		거꾸로정삼각형그리기(height);
		
	}
	
	// 메소드 오버로딩
	public static void 사각형그리기(int width, int height, int 빈칸) {
	    for (int i = 0; i < height; i++) {
	        System.out.printf("%2d : ", i + 1);
	        
	        for (int k = 0; k < 빈칸; k++) {
	            System.out.print("  ");
	        }
	        for (int j = 0; j < width; j++) {
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	}
	
	
	public static void 크리스마스트리그리기(int height) {
	    int 현재행 = 0;

	    for (int i = 0; i < height; i++) {
	        System.out.printf("%2d : ", i + 1);

	        if ((i + 1) % 5 == 0) {
	            for (int k = 0; k < height - 현재행 - 1; k++) {
	                System.out.print(" ");  
	            }
	            for (int j = 0; j <= 현재행; j++) {
	                System.out.print("o ");  // ☆ → o
	            }
	        } else {
	            for (int k = 0; k < height - 현재행 - 1; k++) {
	                System.out.print(" ");  
	            }
	            for (int j = 0; j <= 현재행; j++) {
	                System.out.print("* ");  // ★ → *
	            }
	        }
	        현재행++; 
	        System.out.println();
	    }
	    
	    //밑둥
	    int 밑둥높이 = height/4;
	    int 밑둥너비 = height/2;
	    int 빈칸 = (height-밑둥너비)/2;
	    사각형그리기(밑둥너비, 밑둥높이, 빈칸);
	}
	
	public static void 메뉴보이기() {
		System.out.println("------------------------");
		System.out.println("1.왼쪽직각삼각형 2.오른쪽직각삼각형 3.정삼각형 4.사각형 5.거꾸로정삼각형 6.모래시계 7.다이아몬드 8.크리스마스트리 9.크기입력 ... 0.그만");
		System.out.println("------------------------");
	}

	
	public static void main(String[] args) {
		//1. 메뉴보이기
		//2. 메뉴입력받기
		//3. 메뉴에 해당하는 메소드 호출하기
		//1~3까지 반복하기!
		
		int width=7;
		int height=7;
		
		
		//몇번 반복하는지 모르기 때문에 while문 사용
		while(true) {
			메뉴보이기();
			System.out.printf("메뉴: ");
			int menu = input.nextInt();
			
			if (menu==0) break;
			
			if (menu==1) 왼쪽직각삼각형그리기(height);
			else if (menu==2) 오른쪽직각삼각형그리기(height);
			else if (menu==3) 정삼각형그리기(height);
			else if (menu==4) 사각형그리기(width, height);
			else if (menu==5) 거꾸로정삼각형그리기(height);
			else if (menu==6) 모래시계그리기(height);
			else if (menu==7) 다이아몬드그리기(height);
			else if (menu==8) 크리스마스트리그리기(height);
			else if (menu==9) {
				System.out.printf("가로: ");
				width=input.nextInt();
				System.out.printf("세로: ");
				width=input.nextInt();
			}
			
			
		}
		
		
	}
}
