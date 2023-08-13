// import java.util.Scanner;

// public class contactnumberSort {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String number = sc.nextLine();
//         if (number.length() >= 5) {
//             String lastDigit = number.substring(number.length() - 5);
//             String convertDigit = new String(new char[5]).replace('\0', 'X');
//             System.out.println(number);
//             System.out.println(convertDigit);
//         } else {
//             System.out.println("Number is too small");
//         }

//     }

// }

import java.util.Scanner;

public class numberLastDigitX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a contact number: ");
        String number = sc.nextLine();

        if (number.length() >= 5) {
            // Perform the operation for numbers with length 5 or more
            String lastFiveDigits = number.substring(number.length() - 5);
            String convertedNumber = number.substring(0, number.length() - 5) + "XXXXX";

            System.out.println("Original number: " + number);
            System.out.println("Converted number: " + convertedNumber);
        } else {
            System.out.println("Contact number is too short to convert.");
        }

        sc.close();
    }
}
