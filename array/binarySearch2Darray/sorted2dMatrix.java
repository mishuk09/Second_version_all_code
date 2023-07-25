package array.binarySearch2Darray;

import java.util.Scanner;

public class sorted2dMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and col:");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] arr = new int[row][col];
        System.out.println("Enter element:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();

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
