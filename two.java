package array.allPattern;

public class two {
    public static void main(String[] args) {
        int num = 10;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
