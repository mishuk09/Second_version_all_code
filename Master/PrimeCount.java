package Master;

public class PrimeCount {
    public static void main(String[] args) {
        int star = 10;
        int end = 100;
        int count = 0;
        for (int i = star; i <= end; i++) {
            int temp = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    temp++;
                }

            }
            if (temp == 2) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
    }

}
