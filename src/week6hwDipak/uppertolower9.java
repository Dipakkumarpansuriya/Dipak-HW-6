package week6hwDipak;

//9. Write a program to convert the upper case to lower case.

import java.util.Scanner;

public class uppertolower9 {


    public static void main(String[] args) {
        uptolow();
    }

    public static void uptolow() {
        System.out.println("Write your statement : ");
        String S1 = new String();
        Scanner scanner = new Scanner(System.in);
        S1 = scanner.nextLine();
        System.out.println(S1.toLowerCase());
        scanner.close();

    }
}
