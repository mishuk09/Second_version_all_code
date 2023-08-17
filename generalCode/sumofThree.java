    import java.util.Scanner;

    class NumberManipulator {
        public int getValues(int[] values) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the first value: ");
            values[0] = scanner.nextInt();

            System.out.println("Enter the second value: ");
            values[1] = scanner.nextInt();

            System.out.println("Enter the third value: ");
            values[2] = scanner.nextInt();

            int sum = values[0] + values[1] + values[2];

            scanner.close();
            return sum;
        }
    }

    public class sumofThree {
        public static void main(String[] args) {
            NumberManipulator n = new NumberManipulator();

            // local variable definition
            int[] values = new int[3];
            int sum;

            // calling a function to get the values
            sum = n.getValues(values);

            System.out.println("After method call, value of a: " + values[0]);
            System.out.println("After method call, value of b: " + values[1]);
            System.out.println("After method call, value of c: " + values[2]);
            System.out.println("Sum: " + sum);
        }
    }
