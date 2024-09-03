package array.Leetcode;

public class Arr1 {
    public static void main(String[] args) {
        int arr[] = { 5, 8, 2, 7 };
        int target = 9;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i] + arr[j] == target) {
                        System.out.println(i + " " + j);
                    }

                }

            }

        }
    }

}
