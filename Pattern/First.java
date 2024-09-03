package Pattern;

// Q20. Find the maximum , minimum and sum of all numbers from the given array .
// Num = [1,5,7,9,-1,10,40,4,49]

public class First {
    public static int Max(int num[]) {
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
            }
        }
        return max;
    }

    public static int Min(int num[]) {
        int min = num[0];
        for (int i = 0; i < num.length; i++) {
            if (min > num[i]) {
                min = num[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 7, 9, -1, 10, 40, 4, 49 };
        int result = Max(arr);
        int result2 = Min(arr);
        System.out.println("Max:" + result);
        System.out.println("Max:" + result2);
    }

}
