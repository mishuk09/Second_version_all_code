import java.util.Scanner;

public class takingGenderInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        char gender = Character.toUpperCase(sc.next().charAt(0));

        String prefix = (gender == 'M') ? "Mr." : (gender == 'F') ? "Ms." : "";
        System.out.println("Hello" + " " + prefix + " " + name);

    }

}
