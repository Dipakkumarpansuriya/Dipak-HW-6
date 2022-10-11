package week6hwDipak;
/*10. Write a Java program that takes a number as input and prints its
multiplication table up to 10.
Test Data: Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80*/

import java.util.Scanner;

public class table10 {
   static int A;

    public static void main(String[] args) {
     area();
    }
    public static void area() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter A = ");
         A = scanner.nextInt();
         scanner.close();
        System.out.println(A + " * 1 = "+A*1);
        System.out.println(A + " * 2 = "+A*2);
        System.out.println(A + " * 3 = "+A*3);
        System.out.println(A + " * 4 = "+A*4);
        System.out.println(A + " * 5 = "+A*5);
        System.out.println(A + " * 6 = "+A*6);
        System.out.println(A + " * 7 = "+A*7);
        System.out.println(A + " * 8 = "+A*8);
        System.out.println(A + " * 9 = "+A*9);
        System.out.println(A + " * 10 = "+A*10);
}}
