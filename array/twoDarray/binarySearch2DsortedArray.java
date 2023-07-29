package array.twoDarray;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearch2DsortedArray {

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14 }
        };
        int target = 5;

        System.out.println(Arrays.toString(twoDarrayLinear(arr, target)));
    }

    static int[] twoDarrayLinear(int[][] arr, int target) {
        int row = 0;
        int col = arr.length - 1;

        while (row < arr.length && col >= 0) {
            if (arr[row][col] == target) {
                return new int[] { row, col };
            }
            if (arr[row][col] < target) {
                row++;
            } else {
                col--;
            }

        }
        return new int[] { -1, -1 };
    }

}
