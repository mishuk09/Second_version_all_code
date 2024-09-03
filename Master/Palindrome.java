package Master;

public class Palindrome {
    public static void main(String[] args) {
        String str = "Hasan";

        int len = str.length();

        String rev = "";

        for (int i = len - 1; i < 0; i--) {
            char ch = str.charAt(i);
            rev += ch;
        }
        System.out.println(rev);

    }
}
