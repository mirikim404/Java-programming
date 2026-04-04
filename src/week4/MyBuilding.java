package week4;

import java.util.Scanner;

public class MyBuilding {
	static Scanner input = new Scanner(System.in);
	static int 건물층수;
	
	public static void showBuilding(int[][] ar) {
		for(int row=0; row<건물층수; row++) {
			System.out.printf("[%2d] : ", row+1);
			if(ar[row]==null) {
				System.out.println("X");
				continue;
			}
			for(int col=0; col<ar[row].length; col++) {				
				if(ar[row][col]==0) System.out.print("□ ");
				else System.out.print("■ ");								
			}
			System.out.println();
		}	 		
	}

	public static void showStatus(int[][] ar) {
		for(int row=0; row<건물층수; row++) {
			System.out.printf("[%2d] : ", row+1);
			if(ar[row]==null) { 
				System.out.println("X");
				continue;
			}
			for(int col=0; col<ar[row].length; col++) {
				System.out.printf("[%2d]",ar[row][col]);								
			}
			System.out.println();
		}	 		
	}
	
	public static void moveIn(int [][] ar) {
		if(ar==null) {
			System.out.println("아직 건물이 생성되지 않았습니다.");
			return;
		}
		System.out.print("입주할 층 : "); int row = input.nextInt();
		System.out.print("입주할 열 : "); int col = input.nextInt();
		if (row <1 || row >건물층수 ) {
			System.out.println("유효한 층 범위가 아닙니다.!");
			return; 
		}
		if(ar[row-1]==null) {
			System.out.println(row +" 층에 아직 방이 생성되지 않았습니다.");
			return;
		}
		if (col <1 || col>ar[row-1].length) {
			System.out.println("유효한 층 범위가 아닙니다.!");
			return; 
		}
		if(ar[row-1][col-1] !=0) {
			System.out.println("해당 공간에는 세입자가 있습니다.");
			return;
		}
		System.out.print("입주할 인원 : ");
		ar[row-1][col-1]=input.nextInt();
	}
	
	
	public static void moveOut(int[][] ar) {
	    if (ar == null) {
	        System.out.println("아직 건물이 생성되지 않았습니다.");
	        return;
	    }
	    System.out.print("퇴실할 층 : "); int row = input.nextInt();
	    System.out.print("퇴실할 열 : "); int col = input.nextInt();

	    if (row < 1 || row > 건물층수) {
	        System.out.println("유효한 층 범위가 아닙니다!");
	        return;
	    }
	    if (ar[row-1] == null) {
	        System.out.println(row + "층에 방이 없습니다.");
	        return;
	    }
	    if (col < 1 || col > ar[row-1].length) {
	        System.out.println("유효한 열 범위가 아닙니다!");
	        return;
	    }
	    if (ar[row-1][col-1] == 0) {
	        System.out.println("이미 비어있는 방입니다.");
	        return;
	    }

	    ar[row-1][col-1] = 0;
	    System.out.println(row + "층 " + col + "번 방 퇴실 완료!");
	}
	
	public static int [][] makeBuilding(int [][]ar) {
		if (ar!=null) {
			System.out.println("이미 건물이 지어져있습니다.");
			return ar; 
		}
		System.out.println("새로운 빌딩을 만듭니다.");
		System.out.print("건물의 층 수 : ");
		int row = input.nextInt();
		int [][] building = new int[row][];
		건물층수=row;
		System.out.println("각 층마다 방의 개수를 입력합니다.");
		for(int i=0; i<row; i++) {
			System.out.printf("[%2d]층의 방개수 :", i+1); 
			int col = input.nextInt();
			building[i]=new int[col];
		}
		return building;
	}
	
	public static int [][] remodelFloor(int[][] ar) {
		System.out.println("건물의 층을 리모델링합니다. 확장/축소가 가능하지만 해당층에 입주자가 있을 경우는 불가능합니다.");
		System.out.println("주의 : 추가된 층에 방은 생성되지 않습니다.");
		System.out.printf("현재 건물은 %d층입니다. 몇 층으로 만들까요?", 건물층수);
		int 이전건물층수=건물층수;
		int row = input.nextInt();
		int [][] building = new int[row][];
		건물층수=row;
		if (건물층수 > 이전건물층수 ) {
			for(int i=0; i<이전건물층수; i++) {				
				if (ar[i]==null) continue;
				building[i]=new int[ar[i].length];					
				for(int j=0; j<ar[i].length; j++) { 
					building[i][j]=ar[i][j];
				}
			}
			return building;
		}
		if (건물층수 < 이전건물층수) {	
			for (int i=이전건물층수-1; i>=건물층수; i--) {
				System.out.printf("[%2d]층 검사 중..\n", i+1);
				if (ar[i]==null) continue;
				for(int j=0; j<ar[i].length; j++)
					if (ar[i][j]!=0) {
						System.out.println((j+1) +"번 방에 입주자가 있으므로 축소불가. 리모델링을 취소합니다.");
						건물층수=이전건물층수;
						return ar;
					}				
			}
			System.out.println("축소성공!");			
			return ar;
		}
		else {
			System.out.println("건물의 높이가 같습니다.");
			return ar;
		}
	}
	
	public static void remodelColumn(int[][] ar) {
		System.out.println("방개수를 리모델링합니다. 확장/축소가 가능하지만 입주자가 있을 경우는 불가능합니다.");
		System.out.printf("현재 건물은 %d층입니다. 몇 층의 방 개수를 변경할까요?", 건물층수);
		int row = input.nextInt();
		if(row <1 || row > 건물층수) {
			System.out.println("유효한 층이 아닙니다!");
			return;
		}
		System.out.print("방을 몇개로 변경할까요? : ");
		int col = input.nextInt();
		if (ar[row-1]==null) {
			ar[row-1] = new int[col];
			System.out.println("기존에 방이 없어서 새로 만들었습니다.!");
		}
		int oldCol = ar[row-1].length;
		if(oldCol > col) {
			for(int i=oldCol; i>col; i--) {
				if (ar[row-1][i-1] !=0 ) {
					System.out.printf("%d번방에 입주자가 있어서 축소불가! \n", i);
					return; 
				}
			}
		}
		int [] newRow= new int[col];
		for(int i=0; i<oldCol & i<col; i++)
			newRow[i]=ar[row-1][i];
		ar[row-1]=newRow;
		System.out.println(row + "층의 방 개수 리모델링 성공!");
	}

	public static void showMenu() {
		System.out.println("========================================");
		System.out.println("1.빌딩만들기 2.입주하기 3.퇴실하기 4.리모델링하기(층) 5.리모델링하기(열) 6.빌딩보이기 7.입주상태보기.....0.종료");
		System.out.println("========================================");
	}
	
	public static void main(String[] args) {
		int [][] building=null;
		while(true) {
			showMenu();
			System.out.print("메뉴:");
			int menu = input.nextInt();
			if(menu==0) break;
			if (menu==1) building=makeBuilding(building);
			else if(menu==2) moveIn(building); 
			else if(menu==3) moveOut(building);
			else if(menu==4) building=remodelFloor(building); 
			else if(menu==5) remodelColumn(building); 			
			else if (menu==6) showBuilding(building);
			else if (menu==7) showStatus(building);
		}
	}
}