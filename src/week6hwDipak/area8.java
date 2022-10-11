package week6hwDipak;
//8. Write a program to calculate the area of a triangle.

import java.util.Scanner;

public class area8 {

    static double h;
    static double b;

    public static void main(String[] args) {
        area();
    }

    public static void area() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter h = ");
        h = scanner.nextDouble();
        System.out.print("Please enter b = ");
        b = scanner.nextDouble();
        scanner.close();
        System.out.println("Total Area of Triangle = " + (h * b / 2.0));

    }
}
