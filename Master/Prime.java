package Master;

public class Prime {
    public static void main(String[] args) {
        int num = 20;
        // int temp = 0;
        boolean pr = false;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                pr = true;
            }

        }
        if (!pr) {
            System.out.println("Prime");
        } else {
            System.out.println("Mot Prime");
        }

    }
}
