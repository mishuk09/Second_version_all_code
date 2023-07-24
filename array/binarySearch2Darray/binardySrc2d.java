package array.binarySearch2Darray;

import java.util.Scanner;

public class binardySrc2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and coll");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        System.out.println("Enter array data");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[row][col] = sc.nextInt();

            }
        }
        System.out.println("Output");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(arr[i][j]);

            }
            System.out.println();
        }
    }
}
