package generalCode;

public class linearSearch {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4, },
                { 12, 14, 17, 20 },
                { 22, 24, 25, 26 }
        };
        int target = 17;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    System.out.println("Target found in:" + i, j);
                }
            }
            System.out.println();

        }

    }

}
