package Master;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radiuos:");
        double rad = sc.nextDouble();

        System.out.println(3.1416 * rad * rad);

    }
}
