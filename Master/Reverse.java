package Master;

public class Reverse {
    public static void main(String[] args) {
        int num = 121;
        int rev = 0;
        int temp = num;

        while (num > 0) {

            int lastDigit = num % 10;
            rev = (num * 10) + lastDigit;
            num /= 10;
        }
        if (temp == num) {
            System.out.println("Reverse");
        }

    }

}
