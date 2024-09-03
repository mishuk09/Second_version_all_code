package Master;

public class StrongNumber {

    public static int Factorial(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        return fact;

    }

    public static void main(String[] args) {
        int num = 145;
        int originalNum = num;
        int tem = 0;
        while (num != 0) {

            int temp = num % 10;
            tem = tem + Factorial(temp);
            num = num / 10;

        }

        if (originalNum == tem)

        {
            System.out.println("Strrong");
        } else {
            System.out.println("Not strong");
        }
    }
}