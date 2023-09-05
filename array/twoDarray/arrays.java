import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        int[][] arr = { { 100, 22, 34 }, { 54, 65, 14 }, { 57, 23, 56 } };
        int target = 65;
        int[] result = linearSearch(arr, target);
        System.out.println("Element found at: " + Arrays.toString(result));
    }

    static int[] linearSearch(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}
