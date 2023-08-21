package generalCode;

public class findMaximum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[0] < arr[i]) {
                System.out.println(i);
            }

        }

    }

}
