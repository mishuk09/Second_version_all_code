package Master;

public class LargeNumber {
    public static void main(String[] args) {
        int a = 100;
        int b = 20;
        int c = 30;
        if (a > b && a > c) {
            System.out.println("A large");
        } else if (b > a && b > c) {
            System.out.println("B large");
        } else {
            System.out.println("C large");
        }
    }
}
