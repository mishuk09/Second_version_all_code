public class fibonaccy {

    static void fibonaccy(int x) {
        int num1 = 0;
        int num2 = 1;
        int count = 0;
        while (count < x) {
            int temp = num2 + num1;
            num1 = num2;
            num2 = temp;

            count++;
            System.out.println(num1 + " ");
        }
    }

    public static void main(String[] args) {

        int num = 10;

        fibonaccy(num);
    }
}
