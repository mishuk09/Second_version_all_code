import java.util.Arrays;

public class linear1 {

    static int[] linearsearch(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[] { i, j };
                }
            }

        }
        return new int[] { -1, -1 };

    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 },
                { 5, 7, 8, 9 },
                { 11, 22, 33, 43 } };
        int target = 7;
        int[] result = linearsearch(arr, target);
        System.out.println(Arrays.toString(result));
    }

}


// math={-5,-4,-3,-2,-1,0,1,2,3,4,5}//normal math

// arr={0,1,2,3,4,5,6,7,8}//index

// arr={-1,2,3,-40000,5,6,7,8,9}//element
// arr={-40000,-1,2,3,4,5,6,7}


// arr={-1};

// arr={1,2,3,4,5,6,7,8}//index
// arr={-1};
// arr={length-1};








