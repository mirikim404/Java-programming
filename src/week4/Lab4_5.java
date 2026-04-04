package week4;

public class Lab4_5 {
    public static void init_array(int[][] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = (i + 1) * 10 + j;
    }

    public static void show_array(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] intArray = new int[4][];
        //0번 행에 크기 3짜리 배열을 할당한다 생각하기 
        intArray[0] = new int[3];
        intArray[1] = new int[2];
        intArray[2] = new int[3];
        intArray[3] = new int[2];
        init_array(intArray);
        show_array(intArray);
    }
}
