package generalCode;

public class arraySearch {
    static int array(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return 1;
            }
        }
        return 0;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int target = 6;
        int result = array(arr, target);
        System.out.println(result);

    }

}
