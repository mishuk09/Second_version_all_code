public class armstrongNum {
    public static void main(String[] args) {

        int num = 153;
        int arm = 0;
        int temp = num;

        while (num > 0) {
            int lastDigit = num % 10;
            arm = (lastDigit * lastDigit * lastDigit) + arm;
            num = num / 10;

        }
        if (temp == arm) {
            System.out.println("Number is armstrong number");
        } else {
            System.out.println("Not armstrong Number");
        }
    }

}
