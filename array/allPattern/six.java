package array.allPattern;

public class six {
    public static void main(String[] args) {
        int num = 10;

        for (int row = 0; row < 2 * num; row++) {
            int totalCol = row > num ? 2 * num - row : row;
            int numberOfspaces = num - totalCol;
            for (int s = 0; s < numberOfspaces; s++) {

                System.out.print(" ");
            }

            for (int col = 0; col < totalCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
