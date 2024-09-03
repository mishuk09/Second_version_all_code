public class LeapYear {
    public static void main(String[] args) {
        int year = 2004;
        if (year % 4 == 00 || year % 400 == 00) {
            System.out.println("Leapyear");
        } else {
            System.out.println("Not");
        }
    }
}
