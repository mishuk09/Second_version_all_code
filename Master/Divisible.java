package Master;

public class Divisible {
    public static void main(String[] args) {
        int num = 6;
        int temp = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                temp = temp + i;
            }

        }
        if (num == temp) {
            System.out.println("Perfect");
        } else {
            System.out.println("Not perfect");
        }
    }
}
