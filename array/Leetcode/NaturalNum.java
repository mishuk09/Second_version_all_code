package array.Leetcode;

public class NaturalNum {
    public static void Natural(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;

        }
        System.out.println("Natural Number:" + sum);
    }

    public static int NaturalWith(int num) {
        if (num == 1) {
            return 1;
        }
        return num + NaturalWith(num - 1);
    }

    public static void main(String[] args) {
        Natural(10);
        System.out.println(NaturalWith(5));

    }
}
