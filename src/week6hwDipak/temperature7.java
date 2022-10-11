package week6hwDipak;
/*7. Write a program to insert any temperature value in degree Fahrenheit and
convert to degree Celsius ((F − 32) × 5/9 = 0°C).*/

import java.util.Scanner;

public class temperature7 {
    static double F;

    public static void main(String[] args) {
        temprature();

    }

    public static void temprature() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter F = ");
        F = scanner.nextInt();
        scanner.close();
        System.out.println("Celsius = " + ((F - 32) * 0.555));

    }
}


