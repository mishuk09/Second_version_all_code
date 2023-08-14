package array.allPattern;

import java.util.*;

public class nine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number of terms: ");
        int n = scanner.nextInt();

        int term = 5; // Starting term
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum =sum+ term; // Add the current term to the sum
            System.out.print(term);

            if (i < n) {
                System.out.print(" + ");
            }

            term = term * 10 + 5; // Generate the next term
        }

        System.out.println("\nSum of the series: " + sum);
    }
}
