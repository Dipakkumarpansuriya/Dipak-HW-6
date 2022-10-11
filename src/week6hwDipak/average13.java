package week6hwDipak;
/*13. Write a Java program that takes three numbers as input to calculate and
print the average of the numbers.*/

import java.util.Scanner;

public class average13 {
    static double A;
    static double B;
    static double C;

    public static void main(String[] args) {
        Average();
    }
    public static void Average() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter A = ");
        A = scanner.nextDouble();
        System.out.print("Please enter B = ");
        B = scanner.nextDouble();
        System.out.print("Please enter C = ");
        C = scanner.nextDouble();
        scanner.close();
        System.out.println("Total Average = " + (A + B + C) / 3);


    }

}
