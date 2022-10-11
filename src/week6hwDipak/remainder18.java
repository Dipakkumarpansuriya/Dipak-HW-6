package week6hwDipak;
/*Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter A = ");
        A = scanner.nextDouble();
        System.out.print("Please enter B = ");
        B = scanner.nextDouble();*/


public class remainder18 {
    static int x = 125;
    static int y = 24;

    public static void main(String[] args) {
        sum();
        multiply();
        sub();
        divide();
        reminder();
    }

    public static void sum() {
        System.out.println("125+24 = " + (x + y));
    }
    public static void multiply() {
        System.out.println("125-24 = " + (x - y));
    }
    public static void sub() {
        System.out.println("125*24 = " + (x * y));
    }
    public static void divide() {
        System.out.println("125/24 = " + (x / y));
    }
    public static void reminder() {
        System.out.println("125 mod 24 = " + (x % y));
    }


}
