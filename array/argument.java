package array;

public class argument {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        System.out.println("You entered the following " + args.length + " command line arguments:");

        for (String arg : args) {
            System.out.println(arg);
        }
    }

}
