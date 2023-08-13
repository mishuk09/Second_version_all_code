public class palindromeNum {
    public static void main(String[] args) {
        int num = 121;
        int rev = 0;
        int temp = num;

        while (num > 0) {
            int lastDigit = num % 10;
            rev = (rev * 10) + lastDigit;
            num = num / 10;
        }

        if (temp == rev) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
