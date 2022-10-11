package week6hwDipak;

 /*6. Write a program to enter any radius value of the circle and find out the
area.(Formula of Area A=PI*r*r).*/

import java.util.Scanner;

public class radiusvalue6 {

    double PI = 3.1416;
    static double r;

    public static void main(String[] args) {
        radius();
    }
    public static void radius(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter First value = ");
        r = scanner.nextInt();
        radiusvalue6 obj = new radiusvalue6();
        scanner.close();
        System.out.println("Area A = " + (3.14*r*r));
    }
}
