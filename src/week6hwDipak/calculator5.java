package week6hwDipak;


/*5. Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods.(Note: Two static and Two instance methods.)*/

import java.util.Scanner;

public class calculator5 {
    static int X;
    static int Y;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter First value = ");
        X = scanner.nextInt();
        System.out.print("Please enter Second value = ");
        Y = scanner.nextInt();
        calculator5 obj = new calculator5();
        obj.addition();
        obj.subtraction();
        multiplication();
        division();
        scanner.close();
    }
    public void addition() {
        System.out.println("Addition = " + (X + Y));
    }
    public void subtraction() {
        System.out.println("Subtraction = " + (X - Y));
    }
    public static void multiplication() {
        System.out.println("Multiplication = " + (X * Y));
    }
    public static void division() {
        System.out.println("Division = " + (X / Y));
    }

}
