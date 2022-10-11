package week6hwDipak;
//15. Write a Java program to swap two variables.

import java.util.Scanner;

public class swapvariable15 {
    static int x, y, z;

    public static void main(String[] args) {
        Swap();
    }

    public static void Swap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter value x = ");
        x = scanner.nextInt();
        System.out.print("Please enter value y = ");
        y = scanner.nextInt();
        int z = x;
        int x = y;
        int y = z;
        System.out.println();
        System.out.println("After Swapping the value");
        System.out.println("Value of x = " + x);
        System.out.println("Value of y = " + y);


    }
}
