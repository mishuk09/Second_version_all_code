package array;

public class BInarySearchByOrder {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int target = 9;
        int result = binarySearch(arr, target);
        System.out.println(result);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAnsi = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start);

            if (target == arr[mid]) {
                return mid;
            }
            if (isAnsi) {
                if (target < arr[mid]) {
                    end = mid - 1;
                }
            } else {
                if (target > arr[mid]) {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }

}
