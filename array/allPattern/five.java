package array.allPattern;

public class five {
    public static void main(String[] args) {
        int num = 10;

        for (int row = 0; row < 2 * num; row++) {

            int totalCol = row > num ? 2 * num - row  : row;
            for (int j = 0; j <  totalCol; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
