package Master;

public class Fibo {
    public static void main(String[] args) {
        int num = 10;
        int num1 = 0;
        int num2 = 1;
        
        for (int i = 1; i <= num; i++) {
           int  fibo = num1 + num2;
            num1 = num2;
            num2 = fibo;

            System.out.println(0 + fibo);
        }

    }
}
