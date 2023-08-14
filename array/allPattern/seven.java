package array.allPattern;

public class seven {
    public static void main(String[] args) {
        int num = 10;
        for (int row = 0; row < num; row++) {
            for (int space = 0; space < num - row; space++) {
                System.out.print(" ");

            }
            for (int col = 0; col < row; col++) {
                System.out.print("* ");

            }
            System.out.println();

        }

    }

}
