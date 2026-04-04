package week4;

import java.util.Scanner;

public class Rotate {
    static Scanner sc = new Scanner(System.in);

    static int[][] smile = {
        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,1,1,1,1,0,0,0,1,1,1,1,0,0},
        {0,1,0,1,0,0,1,0,1,0,1,0,0,1,0},
        {0,1,0,1,0,0,1,0,1,0,1,0,0,1,0},
        {0,0,0,0,0,0,1,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,1,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,1,0,0,0,0,0,0,0,0},
        {0,0,1,0,0,0,1,0,0,0,0,0,1,0,0},
        {0,0,1,0,0,0,1,1,1,0,0,0,1,0,0},
        {0,0,1,0,0,0,0,0,0,0,0,0,1,0,0},
        {0,0,0,1,0,0,0,0,0,0,0,1,0,0,0},
        {0,0,0,0,1,0,0,0,0,0,1,0,0,0,0},
        {0,0,0,0,0,1,1,1,1,1,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
    };

    static int[][] heart = {
        {0,0,1,1,0,0,0,0,0,1,1,0,0},
        {0,1,0,0,1,0,0,0,1,0,0,1,0},
        {1,0,0,0,0,1,0,1,0,0,0,0,1},
        {1,0,0,0,0,0,1,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,1},
        {0,1,0,0,0,0,0,0,0,0,0,1,0},
        {0,0,1,0,0,0,0,0,0,0,1,0,0},
        {0,0,0,1,0,0,0,0,0,1,0,0,0},
        {0,0,0,0,1,0,0,0,1,0,0,0,0},
        {0,0,0,0,0,1,0,1,0,0,0,0,0},
        {0,0,0,0,0,0,1,0,0,0,0,0,0}
    };

    public static void showArray(int[][] ar) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if (ar[i][j] == 1) System.out.print("■ ");
                else System.out.print("□ ");
            }
            System.out.println();
        }
    }

    // i행 j열 -> j행 size-i-1열
    public static int[][] rotateRight(int[][] ar) {
        int rows = ar.length;
        int cols = ar[0].length;
        int[][] target = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                target[j][rows - i - 1] = ar[i][j];
            }
        }
        return target;
    }

    // i행 j열 -> size-j-1행 i열
    public static int[][] rotateLeft(int[][] ar) {
        int rows = ar.length;
        int cols = ar[0].length;
        int[][] target = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                target[cols - j - 1][i] = ar[i][j];
            }
        }
        return target;
    }

    // i행 j열 -> size-i-1행 j열
    public static int[][] flipDown(int[][] ar) {
        int rows = ar.length;
        int cols = ar[0].length;
        int[][] target = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                target[rows - i - 1][j] = ar[i][j];
            }
        }
        return target;
    }

    public static void showMenu() {
        System.out.println("========================================");
        System.out.println("1.smile 2.heart");
        System.out.println("변환: 3.오른쪽회전 4.왼쪽회전 5.상하반전");
        System.out.println("0.종료");
        System.out.println("========================================");
    }

    public static void main(String[] args) {
        int[][] current = smile;

        while (true) {
            showMenu();
            System.out.print("메뉴: ");
            int menu = sc.nextInt();

            if (menu == 0) break;
            else if (menu == 1) current = smile;
            else if (menu == 2) current = heart;
            else if (menu == 3) current = rotateRight(current);
            else if (menu == 4) current = rotateLeft(current);
            else if (menu == 5) current = flipDown(current);

            showArray(current);
        }
    }
}
