package array.binarySearch2Darray;

import java.util.Arrays;
import java.util.Scanner;

public class twoDarrayLinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and col:");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int target = sc.nextInt();

        int[][] arr = new int[row][col];

        System.out.println("Enter Array elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }

        }

        System.out.println(Arrays.toString(twoDarrayLinear(arr, target)));
    }

    static int[] twoDarrayLinear(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (target == arr[i][j]) {
                    return new int[] { i, j };
                }

            }

        }
        return new int[] { -1, -1 };

    }

}
